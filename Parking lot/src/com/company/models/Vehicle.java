package com.company.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private VehicleType vehicleType;
    private String number;
}
