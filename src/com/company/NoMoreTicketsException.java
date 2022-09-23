package com.company;

public class NoMoreTicketsException extends Exception {
    private String eventName;

    public NoMoreTicketsException(String eventName){
        super();
        this.eventName=eventName;
    }

    @Override
    public String getMessage() {
        return "There are no more tickets available for "+ eventName+ " event";
    }
}
