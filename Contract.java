package com.pluralsight;

public class Contract {

    protected String buyerName;
    protected String buyerEmail;
    protected String vehicleId;

    public Contract(String buyerName, String buyerEmail, String vehicleId) {
        this.buyerName = buyerName;
        this.buyerEmail = buyerEmail;
        this.vehicleId = vehicleId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public double getTotalPrice() {
        return 0;
    }

    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public String toString() {
        return "Buyer: " + buyerName + ", Email: " + buyerEmail + ", Vehicle ID: " + vehicleId;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
}