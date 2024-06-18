package com.extraordinaria.pideya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extraordinaria.pideya.model.DeliveryRoute;

@Repository
public interface DeliveryRouteRepository extends JpaRepository<DeliveryRoute, Long> {
	
	
}