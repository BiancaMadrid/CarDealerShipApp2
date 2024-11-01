package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        ContractDataManager dataManager = new ContractDataManager(); //add filePath here!
        ContractFileManager fileManager = new ContractFileManager(); //add filePath here!
        AdminUserInterface adminUI = new AdminUserInterface(dataManager, fileManager);

        adminUI.displayMenu();
    }
}