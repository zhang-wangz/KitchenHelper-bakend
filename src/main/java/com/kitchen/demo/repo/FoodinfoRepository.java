package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Foodinfo;

public interface FoodinfoRepository extends JpaRepository<Foodinfo, String>, JpaSpecificationExecutor<Foodinfo> {

}