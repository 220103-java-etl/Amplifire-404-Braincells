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
        return userService.createUser(u);
    }

    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable("id") int id) {

        return userService.getById(id).orElse(null);
    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {

        return userService.loginUser(userName, passWord);

    }


}
