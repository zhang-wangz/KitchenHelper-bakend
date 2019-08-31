package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Foodorder;

public interface FoodorderRepository extends JpaRepository<Foodorder, String>, JpaSpecificationExecutor<Foodorder> {

}