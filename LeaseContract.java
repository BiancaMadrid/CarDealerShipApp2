package com.pluralsight;

public class LeaseContract extends Contract {
    private double monthlyFee;
    private double leaseTerm;
    private double residualValue;

    public LeaseContract(String buyerName, String buyerEmail, String vehicleId, double monthlyFee, double leaseTerm, double residualValue) {
        super(buyerName, buyerEmail, vehicleId, monthlyFee, leaseTerm, residualValue);
        this.monthlyFee = monthlyFee;
        this.leaseTerm = leaseTerm;
        this.residualValue = residualValue;
    }

    public String getBuyerName() {
        return super.getBuyerName();
    }

    public String getVehicleId() {
        return super.getVehicleId();
    }

    public double getMonthlyFee() {
        return this.monthlyFee;
    }

    public double getLeaseTerm() {
        return this.leaseTerm;
    }

    public double getResidualValue() {
        return this.residualValue;
    }

    @Override
    public double getTotalPrice() {
        return (monthlyFee * leaseTerm) + residualValue;
    }

    @Override
    public double getMonthlyPayment() {
        return monthlyFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tyoe: Lease, Monthly Payment: " + getMonthlyPayment();
    }
}