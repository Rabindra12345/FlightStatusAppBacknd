package com.flight.flightapp.controller;

import com.flight.flightapp.entity.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.flight.flightapp.repository.LoginRepository;
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginRepository userRepository;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUser user) {
        LoginUser existingUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());

        if (existingUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.ok().build();
        }
    }
}


