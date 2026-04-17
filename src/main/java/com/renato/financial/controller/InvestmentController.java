package com.renato.financial.controller;

import com.renato.financial.dto.InvestmentRequestDTO;
import com.renato.financial.dto.InvestmentResponseDTO;
import com.renato.financial.service.InvestmentService;
import com.renato.financial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/investment")
public class InvestmentController {


    private final InvestmentService investmentService;

    public InvestmentResponseDTO createInvestment(@RequestBody InvestmentRequestDTO investmentRequestDTO){


        return null;
    }
}
