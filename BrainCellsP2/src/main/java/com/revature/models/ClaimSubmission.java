package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="claim_submission")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClaimSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id")
    private Integer claimId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "claim_category")
    private String claimCategory;

    @Column(name = "incident_date")
    private Timestamp incidentDate;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;
}
