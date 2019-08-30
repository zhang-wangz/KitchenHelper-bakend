package com.kitchen.demo.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "buyfood")
@Data
@IdClass(BuyfoodId.class)
public class Buyfood implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "buy_order_id", insertable = false, nullable = false)
  private String buyOrderId;

  @Id
  @Column(insertable = false, name = "food_id", nullable = false)
  private String foodId;

  @Column(name = "num", nullable = false)
  private Integer num;

  @Column(name = "status", nullable = false)
  private Integer status;

  public Buyfood() {

  }
}