package com.extraordinaria.pideya.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extraordinaria.pideya.dto.DeliveryRouteDTO;
import com.extraordinaria.pideya.exceptions.ResourceNotFoundException;
import com.extraordinaria.pideya.model.DeliveryRoute;
import com.extraordinaria.pideya.repository.DeliveryRouteRepository;
import com.extraordinaria.pideya.service.DeliveryRouteService;

@Service
public class DeliveryRouteServiceImpl implements DeliveryRouteService {
    @Autowired
    private DeliveryRouteRepository deliveryRouteRepository;

    private static final List<String> DESTINOS_PERMITIDOS = List.of("Valdemoro", "Pinto", "Getafe", "Leganés");

    @Override
    public List<DeliveryRoute> getAllRoutes() {
        return deliveryRouteRepository.findAll();
    }

    @Override
    public DeliveryRoute getRouteById(Long id) {
        Optional<DeliveryRoute> route = deliveryRouteRepository.findById(id);
        if (route.isPresent()) {
            return route.get();
        } else {
            throw new ResourceNotFoundException("Route not found with id " + id);
        }
    }

    @Override
    public DeliveryRoute createRoute(DeliveryRouteDTO deliveryRouteDTO) {
        if (!DESTINOS_PERMITIDOS.contains(deliveryRouteDTO.getEndLocation())) {
            throw new IllegalArgumentException("Destino no permitido: " + deliveryRouteDTO.getEndLocation());
        }

        DeliveryRoute deliveryRoute = new DeliveryRoute();
        deliveryRoute.setDriverName(deliveryRouteDTO.getDriverName());
        deliveryRoute.setVehicleNumber(deliveryRouteDTO.getVehicleNumber());
        deliveryRoute.setDeliveryDate(deliveryRouteDTO.getDeliveryDate()); // Asegúrate de que los tipos sean compatibles
        deliveryRoute.setStartLocation(deliveryRouteDTO.getStartLocation());
        deliveryRoute.setEndLocation(deliveryRouteDTO.getEndLocation());
        return deliveryRouteRepository.save(deliveryRoute);
    }

    @Override
    public void deleteRoute(Long id) {
        Optional<DeliveryRoute> route = deliveryRouteRepository.findById(id);
        if (route.isPresent()) {
            DeliveryRoute deliveryRoute = route.get();
            deliveryRoute.setDeletedAt(new java.util.Date(System.currentTimeMillis()));
            deliveryRouteRepository.save(deliveryRoute);
        } else {
            throw new ResourceNotFoundException("Route not found with id " + id);
        }
    }
}


