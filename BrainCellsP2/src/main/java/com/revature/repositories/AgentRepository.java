package com.revature.repositories;

import com.revature.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgentRepository extends JpaRepository<Agent,Integer> {

    Agent getAgentByID(int id);
}
