package com.kitchen.demo.repo;

import com.kitchen.demo.model.RecipecommentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipecomment;

public interface RecipecommentRepository extends JpaRepository<Recipecomment, RecipecommentId>, JpaSpecificationExecutor<Recipecomment> {

}