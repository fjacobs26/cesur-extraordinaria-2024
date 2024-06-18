package com.extraordinaria.pideya.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extraordinaria.pideya.dto.DeliveryRouteDTO;
import com.extraordinaria.pideya.exceptions.ResourceNotFoundException;
import com.extraordinaria.pideya.model.DeliveryRoute;
import com.extraordinaria.pideya.repository.DeliveryRouteRepository;

@Service
public class DeliveryRouteServiceImpl {
	@Autowired
    private DeliveryRouteRepository deliveryRouteRepository;

    public List<DeliveryRoute> getAllRoutes() {
        return deliveryRouteRepository.findAll();
    }

    public DeliveryRoute getRouteById(Long id) {
        Optional<DeliveryRoute> route = deliveryRouteRepository.findById(id);
        if (route.isPresent()) {
            return route.get();
        } else {
            throw new ResourceNotFoundException("Route not found with id " + id);
        }
    }

    public DeliveryRoute createRoute(DeliveryRouteDTO deliveryRouteDTO) {
    	if (!isValidDestination(deliveryRouteDTO.getEndLocation())) {
            throw new IllegalArgumentException("Destino no permitido: " + deliveryRouteDTO.getEndLocation());
        }
        DeliveryRoute deliveryRoute = new DeliveryRoute(null, null, null, null, null, null);
        deliveryRoute.setDriverName(deliveryRouteDTO.getDriverName());
        deliveryRoute.setVehicleNumber(deliveryRouteDTO.getVehicleNumber());
        deliveryRoute.setDeliveryDate(deliveryRouteDTO.getDeliveryDate());
        deliveryRoute.setStartLocation(deliveryRouteDTO.getStartLocation());
        deliveryRoute.setEndLocation(deliveryRouteDTO.getEndLocation());
        return deliveryRouteRepository.save(deliveryRoute);
        
    }

    private boolean isValidDestination(String endLocation) {
        List<String> allowedDestinations = Arrays.asList("Valdemoro", "Pinto", "Getafe", "Leganez");
        return allowedDestinations.contains(isValidDestination(null));
	}

	public void deleteRoute(Long id) {
        if (!deliveryRouteRepository.existsById(id)) {
            throw new ResourceNotFoundException("Route not found with id " + id);
        }
        deliveryRouteRepository.deleteById(id);
    }
 
}
