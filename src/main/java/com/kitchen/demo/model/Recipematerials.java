package com.kitchen.demo.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "recipematerials")
@IdClass(RecipematerialsId.class)
public class Recipematerials implements Serializable {
  private static final long serialVersionUID = 1L;


  @Id
  @Column(name = "recipe_id", insertable = false, nullable = false)
  private String recipeId;

  @Id
  @Column(insertable = false, name = "food_id", nullable = false)
  private String foodId;

  @Column(name = "num_of_food", nullable = false)
  private Integer numOfFood;

  @Column(name = "work_address", nullable = false)
  private String workAddress;

  
}