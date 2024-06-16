package com.extraordinaria.pideya.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;

public class DeliveryRouteDTO {

    @NotNull
    private String driverName;

    @NotNull
    private String vehicleNumber;

    @NotNull
    private Date deliveryDate;

    @NotNull
    private String startLocation;

    @NotNull
    private String endLocation;

}
