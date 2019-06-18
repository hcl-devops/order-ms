package com.order.details.rest;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.details.model.ApiResponseMessage;
import com.order.details.model.OrderCreateRequest;
import com.order.details.model.OrderStatusResponse;
import com.order.details.service.OrderService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderApiController {

	@Autowired
	private OrderService orderServiceImpl;

	@GetMapping(value = "/orderstatus/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponseMessage getItemAvailability() {

		List<OrderStatusResponse> response = orderServiceImpl.getAllOrderForUser();

		if (response != null) {
			return new ApiResponseMessage(ApiResponseMessage.OK, "SUCCESS", response);
		} else {
			return new ApiResponseMessage(ApiResponseMessage.NO_RECORD_FOUND, "No Record Found", response);
		}
	}

	@PostMapping("/ordercreate")
	public ApiResponseMessage createOrder(@RequestBody OrderCreateRequest request) throws ParseException {

		Map<String, String> response = orderServiceImpl.createOrder(request);
		if (response != null) {
			return new ApiResponseMessage(ApiResponseMessage.OK, "SUCCESS", response);
		} else {
			return new ApiResponseMessage(ApiResponseMessage.ERROR, "Something Went Wrong", response);
		}
	}

	
	@DeleteMapping("/orderdeletion/{orderId}")
	public ApiResponseMessage deleteOrder(@PathVariable(name = "orderId") String orderId) {
		Map<String, Boolean> response = orderServiceImpl.deleteOrder(orderId);
		if (response != null && !response.isEmpty()) {
			return new ApiResponseMessage(ApiResponseMessage.OK, "SUCCESS", response);
		} else {
			return new ApiResponseMessage(ApiResponseMessage.ERROR, "Something Went Wrong", response);
		}
	}
}
