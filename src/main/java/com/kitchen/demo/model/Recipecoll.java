package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "recipecoll")
@Entity
@Data
public class Recipecoll implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(insertable = false, name = "coll_id", nullable = false)
  private String collId;

  @Column(name = "recipe_Id")
  private String recipeId;

  @Column(name = "coll_user_id")
  private String collUserId;

  @Column(name = "is_coll", nullable = false)
  private Boolean coll;

  
}