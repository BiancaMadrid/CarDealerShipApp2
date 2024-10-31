package com.pluralsight;

public class LeaseContract extends Contract{
    private double monthlyFee;
    private double leaseTerm;
    private double residualValue;

    public LeaseContract(String buyerName, String buyerEmail, String vehicleId, doubleMonthlyFee, double leaseTerm, double residualValue) {
        super(buyerName, buyerEmail, vehicleId);
        this.monthlyFee = monthlyFee;
        this.leaseTerm = leaseTerm;
        this.residualValue = residualValue;
    }

    @Override
    public double getTotalPrice() {
        return (monthlyFee * leaseTerm) + residualValue;

        @Override
        public double getMonthlyPayment() {
            return monthlyFee;
        }

        @Override
        public String toString() {
            return super.toString() + ", Tyoe: Lease, Monthly Payment: " + getMonthlyPayment();
        }
    }
}
