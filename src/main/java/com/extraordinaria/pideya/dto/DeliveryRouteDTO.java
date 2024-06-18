package com.extraordinaria.pideya.dto;

import java.util.Date; // Asegúrate de usar java.util.Date
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import com.extraordinaria.pideya.validators.ValidDeliveryDate;

public class DeliveryRouteDTO {

    @NotNull
    private String driverName;

    @NotNull
    private String vehicleNumber;

    @NotNull
    @ValidDeliveryDate
    private Date deliveryDate; // Asegúrate de usar java.util.Date

    @NotNull
    private String startLocation;

    @NotNull
    @Pattern(regexp = "Valdemoro|Pinto|Getafe|Leganés", message = "El destino debe ser uno de los siguientes: Valdemoro, Pinto, Getafe, Leganés")
    private String endLocation;

    // Getters and Setters
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}

