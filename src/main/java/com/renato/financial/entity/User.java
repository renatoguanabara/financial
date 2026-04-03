package com.renato.financial.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private UUID uuid;
    private String name;
    private String email;
    private String userTypePayedOrFree;
    private String passWord;
}
