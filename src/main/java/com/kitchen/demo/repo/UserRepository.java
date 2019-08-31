package com.kitchen.demo.repo;

import com.kitchen.demo.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser,String> {

    MyUser findMyUserByUserId(String userId);
}
