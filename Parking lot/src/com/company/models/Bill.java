package com.company.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Ticket ticket;
    private Date exitTime;
    private Double amount;
    private Operator operator;
    private List<Payment> payment;
    private Gate gate;

}
