package com.exposit.carsharing.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class AbstractDto implements Serializable {
    private Long id;
}
