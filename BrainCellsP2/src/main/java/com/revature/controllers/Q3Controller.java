package com.revature.controllers;

import com.revature.models.Q3TableView;
import com.revature.repositories.AnylaticsTablesRepository;
import com.revature.repositories.Q3Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class Q3Controller {
    Q3Repository q3Repository;

    public Q3Controller(Q3Repository q3Repository) {
        this.q3Repository = q3Repository;
    }


    @GetMapping("/Q3")
    public
    List<Q3TableView> getAgentRatingOver9() {
        System.out.println(q3Repository.findByAgentRatingGreaterThan(0).get(0));
        List<Q3TableView> AR = q3Repository.findByAgentRatingGreaterThan(0);

        return AR;


    }
}
