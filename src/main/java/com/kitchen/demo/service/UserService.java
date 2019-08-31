package com.kitchen.demo.service;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public interface UserService {

    boolean checkuser(String userId,String pwd);
}
