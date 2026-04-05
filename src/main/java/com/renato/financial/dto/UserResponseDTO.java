package com.renato.financial.dto;


import lombok.Data;

import java.util.UUID;

@Data
public class UserResponseDTO {

    private UUID uuid;
    private String name;
    private String email;


}
