package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User createUser(User u){
        return userRepository.save(u);

    }
    public User loginUser(String username,String password){

        if(userRepository.findByuserName(username).getPassword().equals(password)){

            return userRepository.findByuserName(username);
        }
        else{

            return null;
        }
    }
    public Optional<User> getById(int Id){
        return userRepository.findById(Id);
    }

}
