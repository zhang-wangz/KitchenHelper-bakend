package com.kitchen.demo.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "recipestep")
@IdClass(RecipestepId.class)
public class Recipestep implements Serializable {
  private static final long serialVersionUID = 1L;


  @Id
  @Column(name = "recipe_id", insertable = false, nullable = false)
  private String recipeId;

  @Id
  @Column(name = "step_id", insertable = false, nullable = false)
  private Integer stepId ;

  @Column(name = "step_des", nullable = false)
  private String stepDes;

  
}