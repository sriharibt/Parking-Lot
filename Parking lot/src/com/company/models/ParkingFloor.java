package com.company.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor {
    private List<ParkingSpot> parkingSpotList;
    private int number;
}
