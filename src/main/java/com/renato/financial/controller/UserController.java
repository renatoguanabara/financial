package com.renato.financial.controller;

import com.renato.financial.dto.UserRequestDTO;
import com.renato.financial.dto.UserResponseDTO;
import com.renato.financial.entity.User;
import com.renato.financial.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponseDTO createUser (@Valid @RequestBody UserRequestDTO userRequestDTO){

    return userService.createUser(userRequestDTO);
    }

    @GetMapping
    public List<User> getAllUsers (){
        return userService.getAll();
    }

    @GetMapping("{uuid}")
    public User getUserById(@PathVariable UUID uuid){
        return userService.getById(uuid);
    }

    @DeleteMapping("{uuid}")
    public void deleteById(@PathVariable UUID uuid){
        userService.deleteById(uuid);
    }

    @PutMapping("{uuid}")
    public User updateById(@Valid @PathVariable UUID uuid, @RequestBody UserRequestDTO userRequestDTO){
        return userService.updateById(uuid, userRequestDTO);
    }
}
