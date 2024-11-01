package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Would I add switch case when I add the salescontract class??
    MonthlyPayments.DisplayFinanceScreen();

    //Loan Details
        //Calling loan details using static variables from the MonthlyPayments class
        System.out.println("Loan Principle:\n " + MonthlyPayments.loanPrincipleBorrowed);
        System.out.println("Monthly Payments:\n " + MonthlyPayments.monthlyLoanPayment);
        System.out.println("Yearly Interest Rate:\n " + MonthlyPayments.yearlyInterestRate);
        System.out.println("Loan Terms:\n " + MonthlyPayments.loanTermYears);



    }
}