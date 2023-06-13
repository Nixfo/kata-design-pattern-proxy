package fr.nixfo;

import java.time.LocalDate;

public class ContractService {
    public Contract getContractByNumber(long contractNumber) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (contractNumber == 1) {
            return new Contract(1L,
                    "ONGOING",
                    LocalDate.of(2023, 6, 12),
                    LocalDate.of(3023, 6, 12),
                    "Nixfo",
                    "Legal",
                    "1.0");
        } else {
            return new Contract(contractNumber,
                    "EXPIRED",
                    LocalDate.of(2022, 6, 12),
                    LocalDate.of(2023, 6, 12),
                    "Nixfo",
                    "Legal",
                    "0.3");
        }
    }
}
