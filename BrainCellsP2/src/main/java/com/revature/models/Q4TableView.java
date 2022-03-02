package com.revature.models;


import lombok.*;
import javax.persistence.*;


@Entity
@Table(name="q4table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Q4TableView {
//    @Id
//    @Column(name= "claim_id")
//    private Integer claimId;

    @Id
    @Column(name= "state")
    private String state;

    @Column(name= "substring")
    private String reason;

    @Column(name= "num_claims")
    private Integer numClaims;
}

