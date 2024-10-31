package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class ContractDataManager {
    private List<Contract> contracts = new ArrayList<>();

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public List<Contract> getAllContracts() {
        return contracts;
    }

    public void deleteContract(Contract contract) {
        contracts.remove(contract);
    }
}
