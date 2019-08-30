package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "orderdetail")
@Entity
public class Orderdetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "order_id", insertable = false, nullable = false)
  private String orderId;

  @Id
  @Column(insertable = false, name = "food_id", nullable = false)
  private String foodId;

  @Column(name = "num", nullable = false)
  private Integer num;

  @Column(name = "price", nullable = false)
  private Integer price;

  @Column(name = "discount", nullable = false)
  private Double discount;

  
}