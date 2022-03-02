package com.revature.models;

import lombok.*;

import javax.persistence.*;



@Entity
@Table(name="q3table")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Q3TableView {

//    @Id
//    @Column(name = "agent_id")
//    private String agentId;

    @Id
    @Column(name = "state")
    private String state;

    @Column(name = "agent_rating")
    private Double agentRating;


}



