package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        ContractDataManager dataManager = new ContractDataManager();
        ContractFileManager fileManager = new ContractFileManager("contracts.dat");
        AdminUserInterface adminUI = new AdminUserInterface(dataManager, fileManager);

        adminUI.displayMenu();
    }
}