package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recipestep")
public class Recipestep implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "recipe_id", insertable = false, nullable = false)
  private String recipeId;

  @Id
  @Column(name = "step_id", insertable = false, nullable = false)
  private Integer stepId = 1;

  @Column(name = "step_des", nullable = false)
  private String stepDes;

  
}