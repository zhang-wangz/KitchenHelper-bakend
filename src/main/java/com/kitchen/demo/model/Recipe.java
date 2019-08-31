package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "recipe")
@Data
public class Recipe implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "recipeId", insertable = false, nullable = false)
  private String recipeId;

  @Column(name = "recipe_name", nullable = false)
  private String recipeName;

  @Column(name = "contri_usr", nullable = false)
  private String contriUsr;

  @Column(name = "recipe_des", nullable = false)
  private String recipeDes;

  @Column(name = "recipe_score", nullable = false)
  private String recipeScore = "0";

  @Column(name = "recipe_coll", nullable = false)
  private Integer recipeColl = 0;

  @Column(name = "recipe_brow", nullable = false)
  private Integer recipeBrow = 0;

  
}