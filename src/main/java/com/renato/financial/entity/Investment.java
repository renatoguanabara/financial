package com.renato.financial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;
@Entity
@Table(name = "Investment")
@Data
public class Investment {

    private UUID uuid;
    private String name;
    private String investmentType;
    private double value;

}
