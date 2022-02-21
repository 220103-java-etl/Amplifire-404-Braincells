package com.revature.services;


import com.revature.models.Agent;
import java.util.Optional;
import com.revature.repositories.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    private AgentRepository agentRepository;
    public AgentService(AgentRepository agentRepository){
        this.agentRepository=agentRepository;
    }


    public List<Agent> getAllAgents(){
        return agentRepository.findAll();
    }

    public Agent createAgent(Agent a){
        return agentRepository.save(a);

    }

    public Optional<Agent> getAgentByID(int id){
        return Optional.ofNullable(agentRepository.getAgentByID(id));
    }
}

