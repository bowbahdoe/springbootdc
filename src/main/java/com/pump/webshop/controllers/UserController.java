package com.pump.webshop.controllers;

import com.pump.webshop.DTO.UserDTO;
import com.pump.webshop.dao.OrderDAO;
import com.pump.webshop.dao.UserDAO;
import com.pump.webshop.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(this.userDAO.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        this.userDAO.createUser(userDTO);
        return ResponseEntity.ok("Gelukt");
    }

}
