package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

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
    @JoinColumn
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "claim_category")
    private String claimCategory;

    @Column(name = "incident_date")
    private Date incidentDate;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @ManyToOne
    @JoinColumn
    @Column(name = "agent_id")
    private Integer agentId;
}
