package com.renato.financial.controller;

import com.renato.financial.dto.UserDTO;
import com.renato.financial.entity.User;
import com.renato.financial.service.UserService;
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
    public User createUser (@RequestBody UserDTO userDTO){

    return userService.createUser(userDTO);
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
    public User updateById(@PathVariable UUID uuid, @RequestBody UserDTO userDTO){
        return userService.updateById(uuid,userDTO);
    }
}
