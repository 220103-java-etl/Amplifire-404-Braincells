package com.revature.services;


import com.revature.models.User;
import com.revature.repositories.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    private AgentRepository agentRepository;
    public AgentService(AgentRepository agentRepository){
        this.agentRepository=agentRepository;
    }


    public List<User> getAllAgents(){
        return agentRepository.findAll();
    }
}

