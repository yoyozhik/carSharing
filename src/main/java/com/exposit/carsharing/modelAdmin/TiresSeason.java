package com.exposit.carsharing.modelAdmin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TiresSeason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tiresSeason;

    public TiresSeason() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTiresSeason() {
        return tiresSeason;
    }

    public void setTiresSeason(String tiresSeason) {
        this.tiresSeason = tiresSeason;
    }
}