package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "foodtype")
@Data
@Entity
public class Foodtype implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "food_type_id", insertable = false, nullable = false)
  private String foodTypeId;

  @Column(name = "food_type_name", nullable = false)
  private String foodTypeName;

  @Column(name = "food_type_des", nullable = false)
  private String foodTypeDes;

  
}