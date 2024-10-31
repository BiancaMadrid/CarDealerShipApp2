package com.pluralsight;

public class SalesContract {
public class SalesContract extends Contract {
    //Attributes for Sales
    private double SalesTaxAmount = 0.05;
    private double RecordingFee = 100;
    private double ProcessingFee;
    private boolean financeCar;
    private double MonthlyPayment;

    
    public SalesContract(){


    //Constructor
    public SalesContract(double salesTaxAmount, double recordingFee, double processingFee,
                         boolean financeCar){
        //call Abstract class???
        //use if statement for processing fee bc it varies depending on vehicle price
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financeCar = financeCar;
    //Getters
    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public boolean isFinanceCar() {
        return financeCar;
    }

    //Setters
    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public void setFinanceCar(boolean financeCar) {
        this.financeCar = financeCar;
    }


}
