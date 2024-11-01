public class Main {
    public static void main(String[] args) {
        // Create an instance of ContractFileManager
        ContractFileManager manager = new ContractFileManager();

        // Create and populate a sample lease contract
        LeaseContract leaseExample = new LeaseContract("37846", 31995.00);
        leaseExample.setDate("20210928");
        leaseExample.setCustomerName("Zachary Westly");
        leaseExample.setCustomerEmail("zach@texas.com");
        leaseExample.setMake("Chevrolet");
        leaseExample.setModel("Silverado");
        leaseExample.setType("truck");
        leaseExample.setColor("Black");

        // Display the contract details
        System.out.println("Created new lease contract:");
        manager.displayContract(leaseExample);

        // Save the contract to file
        System.out.println("\nSaving contract to file...");
        manager.saveContract(leaseExample);
        System.out.println("Contract saved successfully!");

        // Create another lease contract with different data to demonstrate multiple contracts
        LeaseContract secondLease = new LeaseContract("525123", 29500.00);
        secondLease.setDate("20210928");
        secondLease.setCustomerName("Dana Wyatt");
        secondLease.setCustomerEmail("dana@texas.com");
        secondLease.setMake("Ford");
        secondLease.setModel("Explorer");
        secondLease.setType("SUV");
        secondLease.setColor("Red");

        // Display and save the second contract
        System.out.println("\nCreated second lease contract:");
        manager.displayContract(secondLease);

        System.out.println("\nSaving second contract to file...");
        manager.saveContract(secondLease);
        System.out.println("Second contract saved successfully!");

        // Demonstrate calculations
        System.out.println("\nDetailed calculations for first lease:");
        System.out.printf("Original Price: $%.2f%n", leaseExample.getOriginalPrice());
        System.out.printf("Expected Ending Value (50%%): $%.2f%n", leaseExample.getExpectedEndingValue());
        System.out.printf("Lease Fee (7%%): $%.2f%n", leaseExample.getLeaseFee());
        System.out.printf("Total Lease Price: $%.2f%n", leaseExample.getTotalPrice());
        System.out.printf("Monthly Payment (36 months @ 4.0%%): $%.2f%n", leaseExample.getMonthlyPayment());
    }
}


