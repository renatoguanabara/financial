package com.renato.financial.service;

import com.renato.financial.dto.UserDTO;
import com.renato.financial.entity.User;
import com.renato.financial.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
        userRepository.save(user);

        return user;
    }

    public List<User> getAll(){
        return userRepository.findAll();


    }


    public User getById(UUID uuid){
        return userRepository.getById(uuid);


    }

}
