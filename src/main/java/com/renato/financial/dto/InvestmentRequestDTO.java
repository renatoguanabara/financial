package com.renato.financial.dto;

import lombok.Data;

@Data
public class InvestmentRequestDTO {

    private String name;
    private String investmentType;
    private double value;
}
