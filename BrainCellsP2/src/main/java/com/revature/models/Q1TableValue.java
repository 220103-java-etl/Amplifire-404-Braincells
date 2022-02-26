package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="q1_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Q1TableValue {

    @Id
    @Column(name = "claim_id")
    private Integer claimId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "state")
    private String state;

    @Column(name = "customer_age")
    private Integer customerAge;

    @Column(name = "approval")
    private Boolean approval;

}
