package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipecomment;

public interface RecipecommentRepository extends JpaRepository<Recipecomment, String>, JpaSpecificationExecutor<Recipecomment> {

}