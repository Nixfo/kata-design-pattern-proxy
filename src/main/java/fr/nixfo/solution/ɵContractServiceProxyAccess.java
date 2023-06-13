package fr.nixfo.solution;

import fr.nixfo.Contract;

import java.time.LocalDate;

public class ɵContractServiceProxyAccess implements ɵContractService {
    private ɵContractService contractService;
    public ɵContractServiceProxyAccess(ɵContractService contractService) {
        this.contractService = contractService;
    }

    @Override
    public Contract getContractByNumber(long contractNumber) {
        Contract contract = this.contractService.getContractByNumber(contractNumber);

        if (contract.getEndDate().isBefore(LocalDate.now())) {
            throw new RuntimeException("You can't access to an expired contract");
        }

        return contract;
    }
}
