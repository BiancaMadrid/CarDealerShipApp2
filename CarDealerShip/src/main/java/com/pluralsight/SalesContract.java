package com.pluralsight;

public class SalesContract extends Contract {

    private String buyerName;
    private String vehicleId;
    private double price;
    private double downPayment;
    private double salesTax;


    public SalesContract(String buyerName, String buyerEmail, String vehicleId, double price, double downPayment, double salesTax) {
        super(buyerName, buyerEmail, vehicleId, price, downPayment, salesTax);
        this.vehicleId = vehicleId;
        this.buyerName = buyerName;
        this.price = price;
        this.downPayment = downPayment;
        this.salesTax = salesTax;
    }

    public String getBuyerName() {
        return super.getBuyerName();
    }

    public String getVehicleId() {
        return super.getVehicleId();
    }

    public double getDownPayment() {
        return this.downPayment;
    }

    public double getSalesTax() {
        return this.salesTax;
    }

    @Override
    public double getTotalPrice() {
        return price + (price * salesTax) - downPayment;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Sale, Total Price: " + getTotalPrice() + ", Monthly Payment: " + getMonthlyPayment();
    }
}