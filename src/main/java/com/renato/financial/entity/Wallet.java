package com.renato.financial.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Wallet")
@Data
public class Wallet {

    @Id
    private UUID uuid;
    private double balance;
    private String investimentType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Bills")
    private Bills bills;
    @JoinColumn(name = "Investment")
    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Investment> investment = new ArrayList<>();
}
