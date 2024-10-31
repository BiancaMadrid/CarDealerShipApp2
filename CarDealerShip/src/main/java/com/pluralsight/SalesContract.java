package com.pluralsight;
import java.util.Scanner;

public class SalesContract extends Contract{
   static Scanner reader = new Scanner(System.in);
//  TODO
    //Two Methods for monthly payment (DEPENDENT ON CUSTOMER FINANCES CAR)\
    //Method for Total Price
    //Call abstract calls in constructor
    //use uses if statements for processing?
    //use if statements for finance car?

public class SalesContract {
public class SalesContract extends Contract {
    //Attributes for Sales
    private double SalesTaxAmount = 0.05;
    private double RecordingFee = 100;
    private double ProcessingFee;
    private boolean financeCar;
    private double MonthlyPayment;
    private static double lotPrice;
    //Display Screen for Sales
    //User Input
    public static void DisplaySales(){
        System.out.println("Welcome to Sales Screen: \n");
        System.out.println("To Calculate Total Sales Price of Vehicle please Enter the Following Information: \n");
        System.out.println("Lot Price: " + lotPrice);
        reader.nextDouble();

        System.out.println("An Automatic Sales Tax of 5% Included: " + salesTaxAmount );
        System.out.println("An Automatic Recording Fee is Included " + recordingFee);
        System.out.println("For Vehicles Under $10,000 the Processing Fee is $295. \n" +
                "For Vehicles Over $10,000 the Processing Fee is $495.\n" +
                "Your Processing Fee is : " + processingFee);
        System.out.println("Will the Vehicle Be Financed? " + financeCar);
        reader.nextLine();

    
    public SalesContract(){
        System.out.println("Your Monthly Payment will be: " + monthlyPayment);
        System.out.println("Your Total Price Including all Fees and Add-ons is: " + totalPrice);


    //Constructor
    public SalesContract( double lotPrice, double salesTaxAmount, double recordingFee, double processingFee,
                         boolean financeCar){
        //call Abstract class???
        //use if statement for processing fee bc it varies depending on vehicle price
        //do i also use if statement for finance car?
        //would i also add if statemnt if financed for monhtly payment
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financeCar = financeCar;

    //Getters

    public static double getLotPrice() {
        return lotPrice;
    }

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

    public static void setLotPrice(double lotPrice) {
        SalesContract.lotPrice = lotPrice;
    }

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
