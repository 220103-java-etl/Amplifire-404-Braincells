package com.revature.controllers;

import com.revature.models.Q4TableView;
import com.revature.repositories.Q3Repository;
import com.revature.repositories.Q4Repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class Q4Controller {

    Q4Repository q4Repository;
    public Q4Controller(Q4Repository q4Repository){
        this.q4Repository=q4Repository;
    }

    @GetMapping("/Q4")
    public
    List<Q4TableView> getMostApprovedClaim(){
        List<Q4TableView> MA = q4Repository.findAll();

        return MA;
    }


}


