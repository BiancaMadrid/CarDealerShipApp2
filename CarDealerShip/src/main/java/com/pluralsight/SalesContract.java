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
    }
}
