package fr.nixfo;

import java.time.LocalDate;

public class Contract {
    private long number;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;
    private String holder;
    private String type;
    private String version;

    public Contract(long number, String status, LocalDate startDate, LocalDate endDate, String holder, String type, String version) {
        this.number = number;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.holder = holder;
        this.type = type;
        this.version = version;
    }

    public long getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getHolder() {
        return holder;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
