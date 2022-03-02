package com.revature.repositories;

import com.revature.models.Q3TableView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface Q3Repository extends CrudRepository<Q3TableView, Integer> {


        List<Q3TableView> findByAgentRatingGreaterThan(double agentRating);
    }

