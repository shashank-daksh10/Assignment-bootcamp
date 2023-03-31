package com.example.Restapi1.Question2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeException  extends RuntimeException{
    public EmployeeException(String s) {
        super(s);
    }
}
