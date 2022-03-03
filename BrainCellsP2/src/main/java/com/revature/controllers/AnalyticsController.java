package com.revature.controllers;

import com.revature.models.Q3TableView;
import com.revature.models.Q4TableView;
import com.revature.repositories.AnylaticsTablesRepository;
import com.revature.repositories.Q3Repository;
import com.revature.repositories.Q4Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {
    Q4Repository q4Repository;
    Q3Repository q3Repository;

    AnylaticsTablesRepository anylaticsTablesRepository;
    public AnalyticsController(AnylaticsTablesRepository anylaticsTablesRepository,Q3Repository q3Repository,Q4Repository q4Repository){
        this.anylaticsTablesRepository=anylaticsTablesRepository;
        this.q3Repository=q3Repository;
        this.q4Repository=q4Repository;
    }

    @GetMapping("/Q1")
    public
    <Q1TableValue> List<Q1TableValue> getClaimOver50(){
        System.out.println(anylaticsTablesRepository.findBycustomerAgeGreaterThan(0).get(0));
        List<Q1TableValue> LS= (List<Q1TableValue>) anylaticsTablesRepository.findBycustomerAgeGreaterThan(0);

        return LS;
    }
    @GetMapping("/Q3")
    public
    List<Q3TableView> getAgentRatingOver9() {
        System.out.println(q3Repository.findByAgentRatingGreaterThan(0).get(0));
        List<Q3TableView> AR = q3Repository.findByAgentRatingGreaterThan(0);

        return AR;


    }
    @GetMapping("/Q4")
    public
    List<Q4TableView> getMostApprovedClaim(){
        System.out.println(q4Repository.findAll());
        List<Q4TableView> MA = (List<Q4TableView>) q4Repository.findAll();

        return MA;
    }




}
