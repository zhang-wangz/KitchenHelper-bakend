package com.kitchen.demo.repo;

import com.kitchen.demo.model.RecipematerialsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipematerials;

public interface RecipematerialsRepository extends JpaRepository<Recipematerials, RecipematerialsId>, JpaSpecificationExecutor<Recipematerials> {

}