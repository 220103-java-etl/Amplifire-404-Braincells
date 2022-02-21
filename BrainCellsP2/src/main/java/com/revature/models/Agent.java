package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="agent")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id")
    private Integer agentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "first_name")
    private String lastName;

    @Column(name = "agent_rating")
    private Integer agentRating;
}

