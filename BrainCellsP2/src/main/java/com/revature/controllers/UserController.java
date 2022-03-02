package com.revature.controllers;

import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();

    }

    @PostMapping
    public User registerUser(@RequestBody User u) {
        if (userService.findByUsername(u.getUserName()) == null) {
            return userService.createUser(u);
        } else {
            return null;
        }
    }


    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable("id") int id) {

        return userService.getById(id).orElse(null);
    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User u) {

        if (userService.findByUsername(u.getUserName())!=null) {
            return userService.loginUser(u.getUserName(), u.getPassword());

        } else {
            return null;
        }


    }
}
