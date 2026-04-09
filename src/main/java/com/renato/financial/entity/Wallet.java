package com.renato.financial.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Wallet")
@Data
public class Wallet {

    @Id
    private UUID uuid;
    private double balance;
    private String investimentType;
    @OneToMany
    @JoinColumn(name = "Bills")
    private Bills bills;
}
