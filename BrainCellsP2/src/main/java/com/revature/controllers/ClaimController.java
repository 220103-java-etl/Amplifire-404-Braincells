package com.revature.controllers;

import com.revature.models.Agent;
import com.revature.models.ClaimSubmission;
import com.revature.services.AgentService;
import com.revature.services.ClaimService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    private ClaimService claimService;
    public ClaimController(ClaimService claimService){
        this.claimService=claimService;
    }

    @GetMapping
    public List<ClaimSubmission> getAllClaims(){
        return claimService.getAllClaims();

    }
    @PostMapping
    public ClaimSubmission createClaim(@RequestBody ClaimSubmission a){
        return claimService.createClaim(a);
    }
    @GetMapping(path="/{id}")
    public ClaimSubmission getClaimById(@PathVariable("id") int id){

        return claimService.getClaimById(id);
    }
    @PutMapping(path="/claims")
    public ClaimSubmission updateClaim(@RequestBody ClaimSubmission a) {

       return claimService.updateClaim(a);
    }
}
