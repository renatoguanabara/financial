package com.renato.financial.dto;

import com.renato.financial.entity.Bills;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class WalletRequestDTO {

    private UUID uuid;
    @NotNull
    @NotBlank(message = "O saldo nao pode ser nulo ou em branco.")
    private double balance;
    @NotNull
    @NotBlank(message = "O tipo de investimeno nao pode ser nulo ou em branco")
    private String investimentType;
    private Bills bills;
}
