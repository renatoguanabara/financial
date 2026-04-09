package com.renato.financial.dto;

import com.renato.financial.entity.Wallet;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class UserRequestDTO {

    @NotNull
    @NotBlank(message = "Nome é obrigatório")
    private String name;
    private String totalInvested;
    @NotNull
    @NotBlank(message = "Email é obrigatório")
    @Email
    private String email;
    @NotNull
    @NotBlank(message = "Password é obrigatório")
    private String passWord;
    private Wallet wallet;



}
