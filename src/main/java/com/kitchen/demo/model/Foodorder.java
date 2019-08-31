package com.kitchen.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "foodorder")
public class Foodorder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "order_id", insertable = false, nullable = false)
  private String orderId;

  @Column(name = "send_time", nullable = false)
  private Date sendTime;

  @Column(name = "send_address", nullable = false)
  private String sendAddress;

  @Column(name = "user_tel", nullable = false)
  private String userTel;

  @Column(name = "order_status", nullable = false)
  private Integer orderStatus = 0;

  @Column(name = "user_id", nullable = false)
  private String userId;

  
}