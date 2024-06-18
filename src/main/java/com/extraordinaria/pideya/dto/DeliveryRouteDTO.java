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

	public DeliveryRouteDTO(@NotNull String driverName, @NotNull String vehicleNumber, @NotNull Date deliveryDate,
			@NotNull String startLocation, @NotNull String endLocation) {
		super();
		this.driverName = driverName;
		this.vehicleNumber = vehicleNumber;
		this.deliveryDate = deliveryDate;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
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

	@Override
	public String toString() {
		return "DeliveryRouteDTO [driverName=" + driverName + ", vehicleNumber=" + vehicleNumber + ", deliveryDate="
				+ deliveryDate + ", startLocation=" + startLocation + ", endLocation=" + endLocation + "]";
	}
    
    
    
    

}
