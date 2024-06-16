package com.extraordinaria.pideya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extraordinaria.pideya.dto.DeliveryRouteDTO;
import com.extraordinaria.pideya.model.DeliveryRoute;
import com.extraordinaria.pideya.service.DeliveryRouteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/routes")
public class DeliveryRouteController {

    @Autowired
    private DeliveryRouteService deliveryRouteService;

    @GetMapping
    public List<DeliveryRoute> getAllRoutes() {
        return deliveryRouteService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public DeliveryRoute getRouteById(@PathVariable Long id) {
        return deliveryRouteService.getRouteById(id);
    }

    @PostMapping
    public DeliveryRoute createRoute(@Valid @RequestBody DeliveryRouteDTO deliveryRouteDTO) {
        return deliveryRouteService.createRoute(deliveryRouteDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRoute(@PathVariable Long id) {
        deliveryRouteService.deleteRoute(id);
    }
}
