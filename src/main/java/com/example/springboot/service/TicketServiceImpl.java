package com.example.springboot.service;

import org.springframework.stereotype.Repository;

@Repository
public interface TicketServiceImpl {
    public abstract TicketService generatedTicket();
}
