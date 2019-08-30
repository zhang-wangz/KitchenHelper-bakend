package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recipecomment")
public class Recipecomment implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "recipe_id", insertable = false, nullable = false)
  private String recipeId;

  @Id
  @Column(insertable = false, name = "user_id", nullable = false)
  private String userId;

  @Column(name = "comment_content", nullable = false)
  private String commentContent;

  @Column(name = "browse_sig", nullable = false)
  private Integer browseSig = 0;

  @Column(name = "coll_sig", nullable = false)
  private Integer collSig = 0;

  @Column(name = "comment_score", nullable = false)
  private Integer commentScore = 0;

  
}