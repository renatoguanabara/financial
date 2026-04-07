package com.renato.financial.dto;

import com.renato.financial.entity.InvestimentType;
import lombok.Data;

import java.util.UUID;

@Data
public class WalletRequestDTO {

    private UUID uuid;
    private double balance;
    private InvestimentType investimentType;
}
