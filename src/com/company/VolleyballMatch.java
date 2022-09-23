package com.company;

public class VolleyballMatch extends Event {
    protected String firstTeam;
    protected String secondTeam;

    public VolleyballMatch(String firstTeam, String secondTeam,String place,String date, String startHour, int numberOfTickets, double priceOfTicket) {
        super(place,date, startHour, numberOfTickets, priceOfTicket);
        this.firstTeam=firstTeam;
        this.secondTeam=secondTeam;
    }

    @Override
    boolean sellTicket(int num) throws NoMoreTicketsException {
        if(num>this.numberOfTickets||this.numberOfTickets==0) {
            throw new NoMoreTicketsException(this.firstTeam + " - " + this.secondTeam);
        }
            else{
                this.numberOfTickets-=num;
            return true;
            }
        }
    }

