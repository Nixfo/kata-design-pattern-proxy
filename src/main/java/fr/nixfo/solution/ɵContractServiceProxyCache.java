package fr.nixfo.solution;

import fr.nixfo.Contract;

import java.util.HashMap;
import java.util.Map;

public class ɵContractServiceProxyCache implements ɵContractService {
    private final ɵContractService contractService;
    private final Map<Long, Contract> contractCache;

    public ɵContractServiceProxyCache() {
        this.contractCache = new HashMap<>();
        this.contractService = new ɵContractServiceDatabase();
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
