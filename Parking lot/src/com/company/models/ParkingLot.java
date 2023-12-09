package com.company.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot {

    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private String address;
    private String name;
    private ParkingLotStatus parkingLotStatus;

}
