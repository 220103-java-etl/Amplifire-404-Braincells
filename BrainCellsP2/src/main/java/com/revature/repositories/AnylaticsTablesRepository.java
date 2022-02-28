package com.revature.repositories;

import com.revature.models.Q1TableValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnylaticsTablesRepository extends CrudRepository<Q1TableValue,Integer> {

     List<Q1TableValue> findBycustomerAgeGreaterThan(Integer age);
}
