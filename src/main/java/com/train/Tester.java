package com.train;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        int totalTicker = 0;
        while (totalTicker != -1) {
            System.out.print("Please enter number of tickets:");
            totalTicker = scanner.nextInt();
            if (totalTicker != -1) {
                System.out.print("How many round-trip tickets:");
                int roundtrip = scanner.nextInt();
                ticket.sun(totalTicker, roundtrip);
            }
        }
        System.out.println("結束訂票");
    }
}
