package com.company.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EVParkingSpot extends BaseModel{
    private ElectricCharger electricCharger;
    private ParkingSpot parkingSpot;
}
