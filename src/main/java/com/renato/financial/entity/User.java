package com.renato.financial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private UUID uuid;
    private String name;
    private String email;
    private String userTypePayedOrFree;
    @JsonIgnore
    private String passWord;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Wallet")
    private Wallet wallet;
}
