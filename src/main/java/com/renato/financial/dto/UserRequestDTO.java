package com.renato.financial.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class UserRequestDTO {

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String totalInvested;
    @NotNull
    @NotBlank
    @Email
    private String email;
    @NotNull
    @NotBlank
    private String passWord;

}
