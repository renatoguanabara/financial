package com.renato.financial.service;

import com.renato.financial.dto.UserRequestDTO;
import com.renato.financial.dto.UserResponseDTO;
import com.renato.financial.dto.WalletRequestDTO;
import com.renato.financial.dto.WalletResponseDTO;
import com.renato.financial.entity.Bills;
import com.renato.financial.entity.User;
import com.renato.financial.entity.Wallet;
import com.renato.financial.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public UserResponseDTO createUser(UserRequestDTO userRequestDTO){
        User user = new User();
        user.setEmail(userRequestDTO.getEmail());
        user.setName(userRequestDTO.getName());
        user.setUuid(UUID.randomUUID());

        Wallet wallet = new Wallet();
        wallet.setUuid(UUID.randomUUID());
        wallet.setBalance(userRequestDTO.getWallet().getBalance());
        wallet.setInvestimentType(userRequestDTO.getWallet().getInvestimentType());

        Bills bills = new Bills();
        bills.setUuid(UUID.randomUUID());
        bills.setName(userRequestDTO.getWallet().getBills().getName());
        bills.setType(userRequestDTO.getWallet().getBills().getType());
        bills.setValue(userRequestDTO.getWallet().getBills().getValue());


        wallet.setBills(bills);
        user.setWallet(wallet);

        userRepository.save(user);


        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setName(user.getName());
        userResponseDTO.setUuid(user.getUuid());


        WalletResponseDTO walletDTO = new WalletResponseDTO();
        walletDTO.setUuid(wallet.getUuid());
        walletDTO.setBalance(wallet.getBalance());
        walletDTO.setInvestimentType(wallet.getInvestimentType());

        userResponseDTO.setWallet(wallet);

        return userResponseDTO;
    }

    public List<UserResponseDTO> getAll(){
        return userRepository.findAll()
                .stream()
                .map(user -> {
                    UserResponseDTO userResponseDTO = new UserResponseDTO();
                    userResponseDTO.setName(user.getName());
                    userResponseDTO.setEmail(user.getEmail());
                    userResponseDTO.setUuid(user.getUuid());
                    return userResponseDTO;
                        }

                ).toList();


    }


    public UserResponseDTO getById(UUID uuid){

        Optional<User> OptionalUser = userRepository.findById(uuid);
        User user = OptionalUser.orElseThrow();
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setName(user.getName());
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setUuid(user.getUuid());

        return userResponseDTO;


    }

    public void deleteById(UUID uuid){
        userRepository.deleteById(uuid);
    }

    public UserResponseDTO updateById(UUID uuid, UserRequestDTO userRequestDTO){
        Optional<User> Optionaluser = userRepository.findById(uuid);
        User user = Optionaluser.orElseThrow();
        user.setEmail(userRequestDTO.getEmail());
        user.setName(userRequestDTO.getName());
        user.setUuid(uuid);
        user.setPassWord(userRequestDTO.getPassWord());
        userRepository.save(user);

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setName(user.getName());
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setUuid(user.getUuid());

        return userResponseDTO;

    }

}
