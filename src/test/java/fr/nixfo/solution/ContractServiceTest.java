package fr.nixfo.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContractServiceTest {

    @Test
    void should_respond_quick_second_time_with_cache() {
        ɵContractService contractService = new ɵContractServiceProxyCache();

        contractService.getContractByNumber(1L);

        long startTime = System.currentTimeMillis();

        contractService.getContractByNumber(1L);

        long endTime = System.currentTimeMillis();

        assertTrue(endTime - startTime < 1000);
    }

    @Test
    void should_restrict_access_to_expired_contract() {
        ɵContractService contractService = new ɵContractServiceProxyAccess();

        assertThrows(RuntimeException.class, () -> contractService.getContractByNumber(2L));
    }
}
