package com.company.dto;


import com.company.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDto {
    private String vehicleNumber;
    private Long gateId;
    private VehicleType vehicleType;
}
