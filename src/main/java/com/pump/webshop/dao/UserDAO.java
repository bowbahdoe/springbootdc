package com.pump.webshop.dao;

import com.pump.webshop.DTO.UserDTO;
import com.pump.webshop.models.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public class UserDAO {
    private UserRepository userRepository;

    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public void createUser(UserDTO userDTO){
        User user = new User(userDTO.name(), userDTO.lastName(), userDTO.addressID(), userDTO.emailAddress(), userDTO.password(), userDTO.authority());
        this.userRepository.save(user);
    }
}
