package com.revature.controllers;

import com.revature.models.Q3TableView;
import com.revature.models.Q4TableView;
import com.revature.repositories.AnylaticsTablesRepository;
import com.revature.repositories.Q3Repository;
import com.revature.repositories.Q4Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {
    Q4Repository q4Repository;
    Q3Repository q3Repository;
    HttpSession session;

    AnylaticsTablesRepository anylaticsTablesRepository;

    Exception e=new Exception();
    public AnalyticsController(AnylaticsTablesRepository anylaticsTablesRepository,Q3Repository q3Repository,
                               Q4Repository q4Repository,HttpSession session){
        this.anylaticsTablesRepository=anylaticsTablesRepository;
        this.q3Repository=q3Repository;
        this.q4Repository=q4Repository;
        this.session=session;



    }


    @GetMapping("/Q1")
    public
    <Q1TableValue> List<Q1TableValue> getClaimOver50() throws Exception{
        if(session.getAttribute("user")!=null){
        System.out.println(anylaticsTablesRepository.findBycustomerAgeGreaterThan(0).get(0));
        List<Q1TableValue> LS= (List<Q1TableValue>) anylaticsTablesRepository.findBycustomerAgeGreaterThan(0);

        return LS;}
        else{
            throw e;
    }
    }
    @GetMapping("/Q3")
    public
    List<Q3TableView> getAgentRatingOver9()throws Exception{
        if(session.getAttribute("user")!=null) {
            System.out.println(q3Repository.findByAgentRatingGreaterThan(0).get(0));
            List<Q3TableView> AR = q3Repository.findByAgentRatingGreaterThan(0);

            return AR;
        }else{
            throw e;
        }

    }
    @GetMapping("/Q4")
    public
    List<Q4TableView> getMostApprovedClaim() throws Exception{
        if(session.getAttribute("user")!=null){
            System.out.println(q4Repository.findAll());
            List<Q4TableView> MA = (List<Q4TableView>) q4Repository.findAll();

            return MA;
        }else{
            throw e;
        }
    }

    }
