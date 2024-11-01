package com.pluralsight;

import java.util.Scanner;

public class AdminUserInterface {
    private ContractDataManager contractDataManager;
    private ContractFileManager contractFileManager;
    private Scanner scanner = new Scanner(System.in);

    public AdminUserInterface(ContractDataManager contractDataManager, ContractFileManager contractFileManager) {
        this.contractDataManager = contractDataManager;
        this.contractFileManager = contractFileManager; }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==================================");
            System.out.println("1.) Add New Contract");
            System.out.println("2.) View Existing Contracts");
            System.out.println("3.) Save Current Contracts to File");
            System.out.println("4.) Load Contracts from an Existing File");
            System.out.println("5.) Exit the Application.");
            System.out.println("==================================");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContract();
                    break;
                case 2:
                    viewContracts();
                    break;
                case 3:
                    saveContracts();
                    break;
                case 4:
                    loadContracts();
                    break;
                case 5:
                    System.out.println("Exiting the Application. Thank you for using this service.");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private void addContract() {
        System.out.println("Enter buyer's name: ");
        String buyerName = scanner.next();
        System.out.println("Enter buyer's email: ");
        String buyerEmail = scanner.next();
        System.out.println("Enter vehicle's ID: ");
        String vehicleId = scanner.next();

        System.out.println("Enter 1 for Sales Contract or 2 for Lease Contract: ");
        int type = scanner.nextInt();
        Contract contract;
        if (type == 1) {
            System.out.println("Enter price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter down payment: ");
            double downPayment = scanner.nextDouble();
            System.out.println("Enter sales tax rate: ");
            double salesTax = scanner.nextDouble();
            contract = new SalesContract(buyerName, buyerEmail, vehicleId, price, downPayment, salesTax);
        } else if
        (type == 2) {
            System.out.println("Enter monthly fee: ");
            double monthlyFee = 0;
            System.out.println("Enter leasing term: ");
            double leaseTerm = 0;
            System.out.println("Enter the residual value here:");
            double residualValue = 0;
            contract = new SalesContract(buyerName, buyerEmail, vehicleId, monthlyFee, leaseTerm, residualValue);
            contractDataManager.addContract(contract);
        } else {
            System.out.println("Invalid contract type. Please return to the menu and try again.");
        } scanner.close();
        System.out.println("Contract added successfully!");
    }

    private void viewContracts () {
        for (Contract contract : contractDataManager.getAllContracts()) {
            System.out.println(contract);
            System.out.println("Viewing current contact details...");
        }
    }

    private void saveContracts () {
        for (Contract contract : contractDataManager.getAllContracts()) {
            contractFileManager.saveContract(contract);
        }
        System.out.println("Contract saved to file successfully.");
    }

    private void loadContracts () {
        contractDataManager.getAllContracts().addAll(contractFileManager.loadContracts());
        {
            System.out.println("Contracts loaded from file successfully.");
        }
    }
}