package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TicketLoader implements Importable {
    private static final String FILE_WITH_CONCERTS_NAME = "dailytickets.txt";
    @Override
    public Object[] importDataFromFile() throws IOException {
        int numberOfRows = getNumberOfRows();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_WITH_CONCERTS_NAME));
        Event[] arrayOfEvents = new Event[numberOfRows];
        String line;
        int currentIndexOfRow = 0;
        return arrayOfEvents;
    }

    private int getNumberOfRows() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(FILE_WITH_CONCERTS_NAME));
        int numberOfRows = 0;
        while(reader.readLine()!=null){
            numberOfRows++;
        }
        reader.close();
        return numberOfRows;
    }
}
