package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Operator;

public interface OperatorRepository extends JpaRepository<Operator, String>, JpaSpecificationExecutor<Operator> {

}