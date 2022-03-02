package com.revature.BrainCellsP2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableJpaRepositories("com.revature.repositories")// tells Spring where our Repositories are located
@EntityScan("com.revature.models") // tell Spring/Hibernate where to find our Beans (Models/Entities)
@ComponentScan("com.revature") // scanned for Stereotypes (Repository/Services/Controllers)
@EnableTransactionManagement
@SpringBootApplication
public class BrainCellsP2Application {

	public static void main (String[] args) {

		SpringApplication.run(BrainCellsP2Application.class, args);
	}

}
