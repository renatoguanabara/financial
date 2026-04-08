package com.renato.financial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Bills")
@Data
public class Bills {

    @Id
    private UUID uuid;
    private String name;
    private double value;
    private String type;

}
