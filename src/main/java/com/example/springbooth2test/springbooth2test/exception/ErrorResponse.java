package com.example.springbooth2test.springbooth2test.exception;

import java.util.List;

public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    private String message;
    private List<String> details;

    //getters and setters
}
