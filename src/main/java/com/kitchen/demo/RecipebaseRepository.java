package com.kitchen.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public abstract interface RecipebaseRepository extends JpaRepository<BeanRecipe,String> {

}
