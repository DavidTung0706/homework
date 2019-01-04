package com.train;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int totalmany = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int roundtrip = scanner.nextInt();

        ticket.sun(totalmany, roundtrip);
    }
}
