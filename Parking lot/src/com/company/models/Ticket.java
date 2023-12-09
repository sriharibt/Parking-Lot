package com.company.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{

    private Date entryTime;
    private Operator operator;
    private Gate gate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
