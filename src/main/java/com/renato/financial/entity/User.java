package com.renato.financial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Wallet wallet;
}
