package com.train;


public class Ticket {
    int ticketsFare = 1000;


    public void sun(int many, int roundtrip) {
        double sum = (many - roundtrip) * ticketsFare + (roundtrip * ticketsFare*2) * 0.9;

        System.out.println("Total tickets:" + many + "\n"
                + "Round-trip:" + roundtrip + "\n"
                + "Total:" + (int) sum);
    }
}


