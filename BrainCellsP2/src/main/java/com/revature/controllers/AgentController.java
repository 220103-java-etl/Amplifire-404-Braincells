package com.revature.controllers;

import com.revature.models.Agent;
import com.revature.models.User;
import com.revature.services.AgentService;
import com.revature.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {
    private AgentService agentService;
    public AgentController(AgentService agentService){
        this.agentService=agentService;
    }

    @GetMapping
    public List<Agent> getAllAgents(){
        return agentService.getAllAgents();

    }
    @PostMapping
    public Agent registerAgent(@RequestBody Agent a){
        return agentService.createAgent(a);
    }

    @GetMapping(path="/{id}")

    public Agent getAgentByID(@PathVariable("id") int id){

        return agentService.getAgentByID(id).orElse(null);
    }
}