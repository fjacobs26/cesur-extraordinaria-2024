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

	public DeliveryRoute(Long id, @NotNull String driverName, @NotNull String vehicleNumber, @NotNull Date deliveryDate,
			@NotNull String startLocation, @NotNull String endLocation) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.vehicleNumber = vehicleNumber;
		this.deliveryDate = deliveryDate;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}

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

	public void setDeliveryDate(java.util.Date date) {
		this.deliveryDate = (@NotNull Date) date;
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

	@Override
	public String toString() {
		return "DeliveryRoute [id=" + id + ", driverName=" + driverName + ", vehicleNumber=" + vehicleNumber
				+ ", deliveryDate=" + deliveryDate + ", startLocation=" + startLocation + ", endLocation=" + endLocation
				+ "]";
	}

	
}
