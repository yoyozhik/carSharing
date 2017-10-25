package com.exposit.carsharing.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CreditCardResponse implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer number;
    private Date validUntil;
}
