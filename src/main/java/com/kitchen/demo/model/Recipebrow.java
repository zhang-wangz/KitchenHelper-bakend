package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Table(name = "recipebrow")
@Data
@Entity
public class Recipebrow implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "brow_id", insertable = false, nullable = false)
  private String browId;

  @Column(name = "recipe_Id")
  private String recipeId;

  @Column(name = "brow_user_id")
  private String browUserId;

  @Column(name = "is_brow", nullable = false)
  private Boolean brow;

  
}