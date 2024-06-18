package com.extraordinaria.pideya.model;

import jakarta.validation.constraints.NotNull;
import java.util.Date; // Asegúrate de usar java.util.Date
import jakarta.persistence.*;

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
    private Date deliveryDate; // Asegúrate de usar java.util.Date

    @NotNull
    private String startLocation;

    @NotNull
    @Column(nullable = false)
    private String endLocation;

    @Column(nullable = true)
    private Date deletedAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}

