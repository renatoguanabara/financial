package com.renato.financial.dto;

import com.renato.financial.entity.UserType;
import lombok.Data;

import java.util.UUID;

@Data
public class WalletResponseDTO {

    private UUID uuid;
    private double balance;
    private String investimentType;
}
