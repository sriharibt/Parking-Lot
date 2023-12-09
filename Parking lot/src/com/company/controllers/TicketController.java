package com.company.controllers;

import com.company.dto.GenerateTicketRequestDto;
import com.company.dto.GenerateTicketResponseDto;
import com.company.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {

        ticketService.generateTicket();
        return null;
    }
}
