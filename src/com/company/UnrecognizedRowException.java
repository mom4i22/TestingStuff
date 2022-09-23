package com.company;

public class UnrecognizedRowException extends Exception {
    private String message;

    public UnrecognizedRowException(String message){
        super(message);
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
