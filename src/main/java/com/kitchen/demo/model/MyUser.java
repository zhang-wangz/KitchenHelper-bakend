package com.kitchen.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "myuser")
public class MyUser implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(insertable = false, name = "user_id", nullable = false)
  private String userId;

  @Column(name = "user_name", nullable = false)
  private String userName;

  @Column(name = "user_tel", nullable = false)
  private String userTel;

  @Column(name = "user_email", nullable = false)
  private String userEmail;

  @Column(name = "user_contact")
  private String userContact;

  @Column(name = "sex", nullable = false)
  private String sex;

  @Column(name = "pwd", nullable = false)
  private String pwd;

  @Column(name = "city", nullable = false)
  private String city;

  @Column(name = "registerDate", nullable = false)
  private Timestamp registerDate;

  
}