package com.extraordinaria.pideya.service;

import java.util.List;

import com.extraordinaria.pideya.dto.DeliveryRouteDTO;
import com.extraordinaria.pideya.model.DeliveryRoute;

public interface DeliveryRouteService {
	List<DeliveryRoute> getAllRoutes();
	DeliveryRoute getRouteById(Long id);
	DeliveryRoute createRoute(DeliveryRouteDTO deliveryRouteDTO);
	void deleteRoute(Long id);
}
