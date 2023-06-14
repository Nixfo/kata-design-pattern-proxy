package fr.nixfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractServiceTest {

    @Test
    void should_respond_quick_second_time_with_cache() {
        ContractService contractService = new ContractService();

        contractService.getContractByNumber(1L);

        long startTime = System.currentTimeMillis();

        contractService.getContractByNumber(1L);

        long endTime = System.currentTimeMillis();

        assertTrue(endTime - startTime < 1000);
    }

    @Test
    void should_restrict_access_to_expired_contract() {
        ContractService contractService = new ContractService();

        assertThrows(RuntimeException.class, () -> contractService.getContractByNumber(2L));
    }

    @Test
    void should_not_restrict_access_to_ongoing_contract() {
        ContractService contractService = new ContractService();

        assertDoesNotThrow(() -> contractService.getContractByNumber(1L));
    }
}
