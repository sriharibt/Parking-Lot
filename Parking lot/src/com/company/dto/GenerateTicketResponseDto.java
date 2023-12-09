package com.company.dto;

import com.company.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenerateTicketResponseDto {

    private ResponseStatus responseStatus;
    private Ticket ticket;

}
