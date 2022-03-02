package com.revature.models;


import lombok.*;
import javax.persistence.*;


@Entity
@Table(name="q4_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Q4TableView {
    @Id
    @Column(name= "claim_id")
    private Integer claimId;

    @Column(name= "state")
    private String state;

    @Column(name= "reason")
    private String reason;
}

