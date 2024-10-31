package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractFileManager {
    private String filePath;

    public ContractFileManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveContract(Contract contract) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath, true))) {
            oos.writeObject(contract);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Contract> loadContracts() {
        List<Contract> contracts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream())) {
            while (true) {
                Contract contract = (Contract) ois.readObject();
                contracts.add(contract);
                }
            } catch (EOFException e) {
                //End of File Reached Exception here
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return contracts;
        }
    }