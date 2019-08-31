package com.kitchen.demo.service.impl;

import com.kitchen.demo.model.MyUser;
import com.kitchen.demo.repo.UserRepository;
import com.kitchen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl  implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean checkuser(String userId, String pwd) {
        MyUser user = userRepository.findMyUserByUserId(userId);
        if(user == null){
            return  false;
        }
        if(user.getPwd().equals(pwd)){
            return true;
        }
        return false;
    }
}
