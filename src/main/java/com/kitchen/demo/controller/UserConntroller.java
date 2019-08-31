package com.kitchen.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.kitchen.demo.model.MyUser;
import com.kitchen.demo.repo.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserConntroller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public JSONObject login(@RequestParam("userName") String userName, @RequestParam("pwd") String pwd) throws ServletException {
        // Check if username and password is null
        if (userName.equals("") || userName == null
                || userName.equals("") || pwd == null)
            throw new ServletException("Please fill in username and password");

        // Check if the username is used
        MyUser  myUser = userRepository.findMyUserByUserName(userName);
        if(myUser == null || !pwd.equals(myUser.getPwd())){
            throw new ServletException("Please fill in username and password correctly");
        }

        // Create Twt token
        String jwtToken = Jwts.builder()
                .setSubject(userName)
                .claim("userPwd", pwd)
                .claim("date",new Date())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "kitchen1191")
                .setExpiration(new Date(System.currentTimeMillis() + 86400))
                .compact();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","login success");
        jsonObject.put("token",jwtToken);
        return jsonObject;
    }

}

