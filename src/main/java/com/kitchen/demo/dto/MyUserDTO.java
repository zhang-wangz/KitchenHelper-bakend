package com.kitchen.demo.dto;

import com.kitchen.demo.enums.Role;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Data
public class MyUserDTO {
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

    private List<Role> roles;

    public static Date date;
}
