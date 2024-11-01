package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractFileManager {
    private String filePath;

    public ContractFileManager() {
        this.filePath = filePath;
    }

    public void saveContract(Contract contract) {
        // Append ObjectOutputStream handling
        try (FileOutputStream fos = new FileOutputStream(filePath, true);
             AppendingObjectOutputStream oos = new AppendingObjectOutputStream(fos)) {
            oos.writeObject(contract);
        } catch (IOException e) {
            System.err.println("Error saving contract: " + e.getMessage());
        }
    }

    public List<Contract> loadContracts() {
        List<Contract> contracts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    Contract contract = (Contract) ois.readObject();
                    contracts.add(contract);
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        return contracts;
    }
}

// Custom ObjectOutputStream to handle appending objects
class AppendingObjectOutputStream extends ObjectOutputStream {
    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Override to prevent writing a header when appending objects
        reset();
    }
}
