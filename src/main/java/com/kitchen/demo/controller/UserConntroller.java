package com.kitchen.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.kitchen.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserConntroller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public JSONObject doLogin(@RequestParam("userId")String userId,@RequestParam("pwd")String userpwd){

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",0);
            jsonObject.put("login","success login");
            jsonObject.put("id",userId);
            return  jsonObject;
    }
}
