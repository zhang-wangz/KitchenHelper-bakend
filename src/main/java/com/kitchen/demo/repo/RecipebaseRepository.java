package com.kitchen.demo.repo;

import com.kitchen.demo.model.BeanRecipe;
import org.springframework.data.jpa.repository.JpaRepository;


public abstract interface RecipebaseRepository extends JpaRepository<BeanRecipe,String> {

}
