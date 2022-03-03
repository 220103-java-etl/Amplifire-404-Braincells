package com.revature.controllers;

import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    private HttpSession session;

    public UserController(UserService userService,HttpSession session) {
        this.userService = userService;
        this.session=session;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();

    }

    @PostMapping
    public User registerUser(@RequestBody User u) {
        if (userService.findByUsername(u.getUserName()) == null &&
                (u.getUserName().length()>5&& u.getUserName().isBlank()!=false)&&
                 u.getPassword().length()>5&& u.getPassword().isBlank()!=false) {
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
            User m =userService.loginUser(u.getUserName(), u.getPassword());
            session.setAttribute("user",m);
            return m;

        } else {
            return null;
        }


    }
}
