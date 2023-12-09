package com.company.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{

    private PaymentMode paymentMode;
    String refId;
    private Double amount;
    private PaymentStatus paymentStatus;


}
