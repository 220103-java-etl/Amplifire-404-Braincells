package com.revature.repositories;

import com.revature.models.Q4TableView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
    public interface Q4Repository extends CrudRepository<Q4TableView,Integer> {

//        List<Q4TableView> findAllMostApprovedClaim(String claimReason);

    }
