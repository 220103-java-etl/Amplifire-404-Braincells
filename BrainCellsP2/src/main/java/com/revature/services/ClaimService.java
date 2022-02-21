package com.revature.services;

import com.revature.models.Agent;
import com.revature.models.ClaimSubmission;
import com.revature.models.User;
import com.revature.repositories.AgentRepository;
import com.revature.repositories.ClaimSubmissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClaimService {
    private ClaimSubmissionRepository claimSubmissionRepository;
    public ClaimService(ClaimSubmissionRepository claimSubmissionRepository){
        this.claimSubmissionRepository=claimSubmissionRepository;
    }
    public List<ClaimSubmission> getAllClaims(){
        return claimSubmissionRepository.findAll();
    }

    public ClaimSubmission getClaimById(Integer Id){
        return claimSubmissionRepository.getById(Id);
    }
    public ClaimSubmission createClaim(ClaimSubmission claimSubmission){
        return claimSubmissionRepository.save(claimSubmission);
    }

    public ClaimSubmission updateClaim(ClaimSubmission claimSubmission){
        return claimSubmissionRepository.save(claimSubmission);
    }
}

