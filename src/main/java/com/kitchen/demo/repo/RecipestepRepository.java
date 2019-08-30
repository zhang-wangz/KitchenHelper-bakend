package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipestep;

public interface RecipestepRepository extends JpaRepository<Recipestep, Integer>, JpaSpecificationExecutor<Recipestep> {

}