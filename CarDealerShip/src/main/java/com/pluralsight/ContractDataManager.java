package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ContractDataManager {
    private List<Contract> contracts = new ArrayList<>();
    private String filePath; //added filepath needs to go here!

    public ContractDataManager(String filePath) {
        this.filePath = filePath;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public List<Contract> getAllContracts() {
        return contracts;
    }

    public void saveContract(Contract contract) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            if (contract instanceof SalesContract) {
                SalesContract salesContract = (SalesContract) contract;
                writer.println("Sales Contract");
                writer.println("Buyer: " + salesContract.getBuyerName());
                writer.println("Vehicle ID: " + salesContract.getVehicleId());
                writer.println("Price: " + salesContract.getTotalPrice());
                writer.println("Down Payment: " + salesContract.getDownPayment());
                writer.println("Sales Tax: " + salesContract.getSalesTax());
                writer.println("Monthly Payment: " + salesContract.getMonthlyPayment());

            } else if (contract instanceof LeaseContract) {
                LeaseContract leaseContract = (LeaseContract) contract;
                writer.println("Sales Contract");
                writer.println("Buyer: " + leaseContract.getBuyerName());
                writer.println("Vehicle ID: " + leaseContract.getVehicleId());
                writer.println("Price: " + leaseContract.getMonthlyFee());
                writer.println("Down Payment: " + leaseContract.getLeaseTerm());
                writer.println("Sales Tax: " + leaseContract.getResidualValue());
                writer.println("Monthly Payment: " + leaseContract.getMonthlyPayment());
            }
            writer.println("-----"); //Needs this so it separates the contracts I guess?
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteContract(Contract contract) {
        contracts.remove(contract);
    }
}