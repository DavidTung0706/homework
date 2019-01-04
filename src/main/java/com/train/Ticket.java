package com.train;


public class Ticket {
    int owt = 1000;
    int rtp = 2000;

    public void sun(int many, int roundtrip) {
        double sum = (many - roundtrip) * owt + (roundtrip * rtp) * 0.9;

        System.out.println("Total tickets:" + many + "\n"
                + "Round-trip:" + roundtrip + "\n"
                + "Total:" + (int) sum);
    }
}


