package com.order.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.details.entities.OrderData;




/**
 * Spring Data JPA repository for the ProjectMetricsActiveSprint entity.
 */
@Repository
public interface OrderDataRepository extends JpaRepository<OrderData,Integer> {

	OrderData findByOrderNo(String orderId);

	void deleteByOrderNo(String orderId);

}
