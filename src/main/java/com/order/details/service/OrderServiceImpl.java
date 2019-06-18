package com.order.details.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.order.details.entities.ItemData;
import com.order.details.entities.OrderData;
import com.order.details.entities.OrderLine;
import com.order.details.model.OrderCreateRequest;
import com.order.details.model.OrderLineCreateReq;
import com.order.details.model.OrderLineDto;
import com.order.details.model.OrderStatusResponse;
import com.order.details.repository.ItemDataRepository;
import com.order.details.repository.OrderDataRepository;
import com.order.details.repository.OrderLineRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDataRepository orderDataRepo;

	@Autowired
	private OrderLineRepository orderLineRepo;

	@Autowired
	private ItemDataRepository itemDataRepo;

	DateFormat formatter1 = new SimpleDateFormat("MMMM-dd-yyyy");

	@Override
	public List<OrderStatusResponse> getAllOrderForUser() {

		List<OrderData> orderDataRes = orderDataRepo.findAll();
		List<OrderStatusResponse> responseList = new ArrayList<>();
		List<String> orderNoList = new ArrayList<>();
		for (OrderData data : orderDataRes) {
			orderNoList.add(data.getOrderNo());
		}
		List<OrderLine> orderLineRes = orderLineRepo.findByOrderNoIn(orderNoList);

		for (OrderData data : orderDataRes) {
			List<OrderLineDto> orderLineList = new ArrayList<>();
			double totalAmount = 0.0;
			OrderStatusResponse res = new OrderStatusResponse();
			res.setBillTo(data.getBillTo());
			if (data.getDeliveryDate() != null)
				res.setDeliveryDate(formatter1.format(data.getDeliveryDate()));
			res.setId(data.getId());
			res.setOrderNo(data.getOrderNo());
			res.setShipTo(data.getShipTo());

			// res.setOrderLine(orderLineList);

			for (OrderLine line : orderLineRes) {
				if (line.getOrderNo().equalsIgnoreCase(res.getOrderNo())) {
					OrderLineDto lineDto = new OrderLineDto();
					lineDto.setId(line.getId());
					lineDto.setItemId(line.getItemId());
					lineDto.setItemKey(line.getItemKey());
					lineDto.setMergeNode(line.getMergeNode());
					if (null != line.getOrderDate())
						lineDto.setOrderDate(formatter1.format(line.getOrderDate()));
					lineDto.setOrdereQty(line.getOrdereQty());
					lineDto.setOrderNo(line.getOrderNo());
					lineDto.setOrderType(line.getOrderType());
					lineDto.setOriginalOrderedQty(line.getOriginalOrderedQty());
					lineDto.setPrimeLineNo(line.getPrimeLineNo());
					if (null != line.getReqShipDate())
						lineDto.setReqShipDate(formatter1.format(line.getReqShipDate()));
					lineDto.setRetailPrice(line.getRetailPrice());
					lineDto.setSellerOrganizationCode(line.getSellerOrganizationCode());
					lineDto.setShipnodeKey(line.getShipnodeKey());
					lineDto.setStatus(line.getStatus());
					if (null != line.getStatusDate())
						lineDto.setStatusDate(formatter1.format(line.getStatusDate()));
					lineDto.setTax(line.getTax());
					lineDto.setUnitPrice(line.getUnitPrice());
					lineDto.setUom(line.getUom());
					lineDto.setImageUrl(line.getImageUrl());

					totalAmount = totalAmount + lineDto.getRetailPrice();
					orderLineList.add(lineDto);
				}
			}
			res.setTotalAmount(totalAmount);
			res.setOrderLine(orderLineList);
			responseList.add(res);

		}

		Collections.sort(responseList, Collections.reverseOrder());
		return responseList;
	}

	@Override
	public Map<String, String> createOrder(OrderCreateRequest request) throws ParseException {

		if (request.getOrderLine() == null || request.getOrderLine().isEmpty()) {
			return null;
		}
		Map<String, String> idMap = new HashMap<>();

		OrderData data = new OrderData();

		Map<String, Integer> itemWithIds = itemDataRepo.findAll().stream()
				.collect(Collectors.toMap(ItemData::getItemId, ItemData::getId));
		Date d = new Date();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = formatter.format(d);
		String dateInString = s.substring(0, 4) + s.substring(5, 7) + s.substring(8, 10);

		data.setBillTo(dateInString + randomNumber(0000, 9999));
		data.setDeliveryDate(request.getDeliveryDate());
		data.setShipTo(data.getBillTo());
		data.setOrderNo("ORD" + dateInString + randomNumber(000000, 999999));

		orderDataRepo.save(data);
		idMap.put("OrderNo", data.getOrderNo());
		idMap.put("deliveryDate", formatter1.format(data.getDeliveryDate()));
		

		int size = request.getOrderLine().size();
		int i = 1;
		for (OrderLineCreateReq line : request.getOrderLine()) {

			Date reqShipDate = (Date) formatter1.parse(line.getReqShipDate());
			Date statusDateForm = (Date) formatter1.parse(line.getStatusDate());
			Date reqDate = (Date) formatter.parse(formatter.format(reqShipDate));
			Date statusDate = (Date) formatter.parse(formatter.format(statusDateForm));
			OrderLine lineRes = new OrderLine();
			lineRes.setImageUrl(line.getImageUrl());
			lineRes.setItemId(line.getItemId());
			if (null != line.getItemId())
				lineRes.setItemKey(itemWithIds.get(line.getItemId()));
			lineRes.setMergeNode("LSC.1042");
			lineRes.setOrderDate(new Date());
			lineRes.setOrdereQty(line.getOrdereQty());
			lineRes.setOrderNo(data.getOrderNo());
			lineRes.setOrderType("HOME DELIVERY");
			lineRes.setOriginalOrderedQty(line.getOrdereQty());
			if (i <= size) {
				lineRes.setPrimeLineNo(i);
				i++;
			}
			lineRes.setReqShipDate(reqDate);
			lineRes.setRetailPrice(line.getRetailPrice());
			lineRes.setSellerOrganizationCode("STO.472");
			lineRes.setShipnodeKey("CDC.028");
			lineRes.setStatus("DELIVERED");
			lineRes.setStatusDate(statusDate);
			lineRes.setUom("Piece");
			lineRes.setTax(line.getRetailPrice() * 0.2);
			lineRes.setUnitPrice(line.getRetailPrice() * 0.8);

			orderLineRepo.save(lineRes);

		}
		return idMap;
	}

	private String randomNumber(int lowerLimit, int upperLimit) {

		Random random = new Random();
		int randomNumber = random.nextInt(upperLimit - lowerLimit) + lowerLimit;
		return Integer.toString(randomNumber);
	}

	@Transactional
	@Override
	public Map<String, Boolean> deleteOrder(String orderId) {

		Map<String, Boolean> deleteMap = new HashMap<>();
		deleteMap.put("isDeleted", Boolean.FALSE);

		OrderData orderData = orderDataRepo.findByOrderNo(orderId);
		List<OrderLine> orderLineDbRes = orderLineRepo.findByOrderNo(orderId);
		if (orderData != null && orderLineDbRes != null && !orderLineDbRes.isEmpty()) {

			orderLineRepo.deleteByOrderNo(orderId);
			orderDataRepo.deleteByOrderNo(orderId);
			deleteMap.put("isDeleted", Boolean.TRUE);
		} else {
			return null;
		}

		return deleteMap;
	}

}
