package com.exposit.carsharing.dto;

import com.exposit.carsharing.domain.AdStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AdResponse extends AbstractResponse {
    private AdStatus status;
    private String carLocation;
    private String returnPlace;
    private BigDecimal CostPerDay;
    private ProfileResponse owner;
    private CarResponse car;
}
