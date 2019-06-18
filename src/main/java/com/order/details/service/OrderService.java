package com.order.details.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.order.details.model.OrderCreateRequest;
import com.order.details.model.OrderStatusResponse;



/**
 * 
 * @author semwaln
 * 
 *         <pre>
 *  Interface providing business logic implementation for Item details
 *         </pre>
 *
 */
@Service
public interface OrderService {

	List<OrderStatusResponse> getAllOrderForUser();

	Map<String, String> createOrder(OrderCreateRequest request) throws ParseException;

	Map<String, Boolean> deleteOrder(String orderId);

}