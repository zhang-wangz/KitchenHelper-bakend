package com.kitchen.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "operator")
@Entity
public class Operator implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "op_id", insertable = false, nullable = false)
  private String opId;

  @Column(name = "op_name", nullable = false)
  private String opName;

  @Column(name = "op_level", nullable = false)
  private Integer opLevel;

  @Column(name = "op_pwd", nullable = false)
  private String opPwd;

  
}