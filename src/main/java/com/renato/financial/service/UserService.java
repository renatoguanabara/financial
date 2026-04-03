package com.renato.financial.service;

import com.renato.financial.dto.UserDTO;
import com.renato.financial.entity.User;
import com.renato.financial.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setUuid(UUID.randomUUID());
        user.setPassWord(userDTO.getPassWord());


        return user;
    }

}
