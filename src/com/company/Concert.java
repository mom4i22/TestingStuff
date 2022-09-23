package com.company;

public class Concert extends Event {

    protected String starName;
    public Concert( String starName,String date, String startHour, int numberOfTickets, double priceOfTicket,String place) {
        super(place,date, startHour, numberOfTickets, priceOfTicket);
        this.starName=starName;
    }

    @Override
    boolean sellTicket(int num) throws NoMoreTicketsException {
        if(num>numberOfTickets||this.numberOfTickets==0){
            throw new NoMoreTicketsException(this.starName+ " 's concert");
        }
        else{
            this.numberOfTickets-=num;
            System.out.println(num + " tickets sold!");
            System.out.println("Number of available tickets is: " +numberOfTickets);
            return true;
        }
    }
}
