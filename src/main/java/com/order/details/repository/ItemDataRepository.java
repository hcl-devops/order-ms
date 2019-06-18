package com.order.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.details.entities.ItemData;




/**
 * Spring Data JPA repository for the ProjectMetricsActiveSprint entity.
 */
@Repository
public interface ItemDataRepository extends JpaRepository<ItemData,Integer> {

}
