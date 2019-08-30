package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Foodtype;

public interface FoodtypeRepository extends JpaRepository<Foodtype, String>, JpaSpecificationExecutor<Foodtype> {

}