package com.revature.repositories;

import com.revature.models.ClaimSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimSubmissionRepository extends JpaRepository<ClaimSubmission,Integer> {


}
