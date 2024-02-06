package com.webservices.restfulwebservice.Exception;

import java.time.LocalDate;

public class ErrorDetails {
    //timestamp
    private LocalDate timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }
}
