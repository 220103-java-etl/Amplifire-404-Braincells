package com.revature.controllers;

import com.revature.repositories.AnylaticsTablesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    AnylaticsTablesRepository anylaticsTablesRepository;
    public AnalyticsController(AnylaticsTablesRepository anylaticsTablesRepository){
        this.anylaticsTablesRepository=anylaticsTablesRepository;
    }

    @GetMapping("/Q1")
    public
    <Q1TableValue> List<Q1TableValue> getClaimOver50(){
        System.out.println(anylaticsTablesRepository.findBycustomerAgeGreaterThan(0).get(0));
        List<Q1TableValue> LS= (List<Q1TableValue>) anylaticsTablesRepository.findBycustomerAgeGreaterThan(0);

        return LS;
    }




}
