package com.renato.financial.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Wallet")
@Data
public class Wallet {

    private UUID uuid;
    private double balance;
    private Investiment investiment;
}
