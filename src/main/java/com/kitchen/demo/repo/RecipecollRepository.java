package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipecoll;

public interface RecipecollRepository extends JpaRepository<Recipecoll, String>, JpaSpecificationExecutor<Recipecoll> {

}