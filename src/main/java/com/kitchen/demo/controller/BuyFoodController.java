package com.kitchen.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kitchen.demo.model.Buyfood;
import com.kitchen.demo.service.BuyFoodService;
import com.kitchen.demo.util.ResultUtil;
import com.kitchen.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyFood")
public class BuyFoodController {

    @Autowired
    private BuyFoodService buyFoodService;

    @GetMapping("/findAll")
    public ResultVO<List<Buyfood>> find() {
        List<Buyfood> list = new ArrayList<>();
        List<Buyfood> buyfoodList = buyFoodService.loadAll();
        for(Buyfood buyfood:buyfoodList){
            list.add(buyfood);
        }
        return ResultUtil.success(list);
    }


    @GetMapping("/load_buy_detail_by_order_id")
    public  ResultVO<List<Buyfood>> loadBuyDetailByOrderId(@RequestParam(value = "orderid") String orderId){
        return ResultUtil.success(buyFoodService.loadBuyDetailByOrderId(orderId));
    }

}
