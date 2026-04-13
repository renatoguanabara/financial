package com.renato.financial.dto;

import lombok.Data;

@Data
public class InvestmentResponseDTO {

    private String name;
    private String investmentType;
    private double value;
}
