package fr.nixfo.solution;

import fr.nixfo.Contract;

import java.util.HashMap;
import java.util.Map;

public class ɵContractServiceProxyCache implements ɵContractService {
    private ɵContractService contractService;
    private Map<Long, Contract> contractCache;

    public ɵContractServiceProxyCache(ɵContractService contractService) {
        this.contractCache = new HashMap<>();
        this.contractService = contractService;
    }

    @Override
    public Contract getContractByNumber(long contractNumber) {
        if (contractCache.containsKey(contractNumber)) {
            return contractCache.get(contractNumber);
        }

        Contract contract = this.contractService.getContractByNumber(contractNumber);
        contractCache.put(contractNumber, contract);
        return contract;
    }
}
