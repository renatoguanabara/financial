package com.renato.financial.controller;

import com.renato.financial.dto.UserDTO;
import com.renato.financial.entity.User;
import com.renato.financial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    private User createUser (@RequestBody UserDTO userDTO){


        return null;
    }
}
