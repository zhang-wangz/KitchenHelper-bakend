package com.kitchen.demo.repo;

import com.kitchen.demo.model.Recipe;
import com.kitchen.demo.model.RecipestepId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipestep;

import java.util.List;

public interface RecipestepRepository extends JpaRepository<Recipestep, RecipestepId>, JpaSpecificationExecutor<Recipestep> {

    List<Recipestep> findRecipestepsByRecipeId(String recipeId);
}