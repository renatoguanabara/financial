package com.renato.financial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "investment")
@Data
public class Investiment {

    private InvestimentType investimentType;
    private String name;
    private String value;
}
