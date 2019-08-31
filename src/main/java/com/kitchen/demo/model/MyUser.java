package com.kitchen.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
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

  @Column(name = "register_date", nullable = false)
  private Timestamp registerDate;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserContact() {
    return userContact;
  }

  public void setUserContact(String userContact) {
    this.userContact = userContact;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Timestamp getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(Timestamp registerDate) {
    this.registerDate = registerDate;
  }
}