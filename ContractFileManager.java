import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {
    private static final String CONTRACTS_FILE = "contracts.txt";

    public void saveContract(LeaseContract contract) {
        try (FileWriter fw = new FileWriter(CONTRACTS_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(contract.toContractString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to contracts file: " + e.getMessage());
        }
    }

    // method to display contract details
    public void displayContract(LeaseContract contract) {
        System.out.println("=== Lease Contract Details ===");
        //System.out.println("Date: " + contract.getDate());
        //System.out.println("Customer: " + contract.getCustomerName());
        //System.out.println("Email: " + contract.getCustomerEmail());
        //System.out.println("Vehicle: "+ contract.getMake() + " " + contract.getModel());
        System.out.println("VIN: " + contract.getVin());
        // System.out.println("Color: " + contract.getColor());
        System.out.println("Original Price: $" + String.format("%.2f", contract.getOriginalPrice()));
        System.out.println("Expected Ending Value: $" + String.format("%.2f", contract.getExpectedEndingValue()));
        System.out.println("Lease Fee: $" + String.format("%.2f", contract.getLeaseFee()));
        System.out.println("Total Lease Price: $" + String.format("%.2f", contract.getTotalPrice()));
        System.out.println("Monthly Payment: $" + String.format("%.2f", contract.getMonthlyPayment()));
        System.out.println("============================");
    }
}

