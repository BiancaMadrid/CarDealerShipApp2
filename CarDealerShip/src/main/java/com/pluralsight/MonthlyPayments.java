package com.pluralsight;
import java.util.Scanner;

public class MonthlyPayments {
    static Scanner reader = new Scanner(System.in);

    //Attributes for Loan Payment
    static double monthlyLoanPayment;
    static double loanPrincipleBorrowed;
    static double monthlyInterestRate;
    static int numberOfMonthlyPayments;
    static double yearlyInterestRate;
    static int loanTermYears;


    //Method to Display Finance Screen
   public static void DisplayFinanceScreen(){
       System.out.println("You have Selected Finance Option:\n ");

       System.out.println("Enter Loan Principle:\n ");
       loanPrincipleBorrowed = reader.nextDouble();

       if(loanPrincipleBorrowed >= 10000){
           yearlyInterestRate = 4.25;
           loanTermYears = 4;//48 months
       }else{
           yearlyInterestRate = 5.25;
           loanTermYears = 2;//24 months
       }
       monthlyLoanPayment = calculateLoanPayments();
       System.out.println("Your Monthly Payment will be:\n " + monthlyLoanPayment);



   }
    //Main Method for Payment
    //Use if and else statement
    public static double calculateLoanPayments() {
       if(loanPrincipleBorrowed >= 10000) {
           yearlyInterestRate = 4.25;
           loanTermYears = 4;
       }else{
           yearlyInterestRate = 5.25;
           loanTermYears = 2;
       }
       monthlyInterestRate = yearlyInterestRate /100 / 12;
       numberOfMonthlyPayments = loanTermYears * 12;

        return (loanPrincipleBorrowed * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1);
   }


    }
