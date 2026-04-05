package com.renato.financial.dto;

import lombok.Data;

@Data
public class UserRequestDTO {

    private String name;
    private String totalInvested;
    private String email;
    private String passWord;

}
