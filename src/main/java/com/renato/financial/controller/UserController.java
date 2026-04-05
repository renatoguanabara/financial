package com.renato.financial.controller;

import com.renato.financial.dto.UserDTO;
import com.renato.financial.entity.User;
import com.renato.financial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser (@RequestBody UserDTO userDTO){

    return userService.createUser(userDTO);
    }

    @GetMapping
    public List<User> getAllUsers (){
        return userService.getAll();
    }
}
