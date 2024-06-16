package com.extraordinaria.pideya.model;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class DeliveryRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String driverName;

    @NotNull
    private String vehicleNumber;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;//

    @NotNull
    private String startLocation;

    @NotNull
    private String endLocation;
}
