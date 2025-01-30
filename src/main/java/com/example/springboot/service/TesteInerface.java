package com.example.springboot.service;

public class TesteInerface {
    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        TicketServiceImpl  t = () -> null;
        System.out.println(ticketService.toString());
        System.out.println(t);



    }
}
