package com.order.details.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.details.entities.OrderLine;

/**
 * Spring Data JPA repository for the ProjectMetricsActiveSprint entity.
 */
@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {

	List<OrderLine> findByOrderNoIn(List<String> orderNoList);

	List<OrderLine> findByOrderNo(String orderId);

	void deleteByOrderNo(String orderId);

}
