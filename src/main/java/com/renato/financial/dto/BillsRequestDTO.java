package com.renato.financial.dto;

import lombok.Data;

@Data
public class BillsRequestDTO {

    private String name;
    private double value;
    private String type;
}
