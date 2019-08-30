package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "foodinfo")
@Data
@Entity
public class Foodinfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(insertable = false, name = "food_id", nullable = false)
  private String foodId;

  @Column(name = "food_des", nullable = false)
  private String foodDes;

  @Column(name = "food_price", nullable = false)
  private Integer foodPrice = 0;

  @Column(name = "food_num", nullable = false)
  private Integer foodNum = 0;

  @Column(name = "food_name", nullable = false)
  private String foodName;

  @Column(name = "food_type_name_of_food_info", nullable = false)
  private String foodTypeNameOfFoodInfo;

  
}