package com.kitchen.demo.controller;


import com.kitchen.demo.model.Orderdetail;
import com.kitchen.demo.repo.FoodorderRepository;
import com.kitchen.demo.repo.OrderdetailRepository;
import com.kitchen.demo.util.ResultUtil;
import com.kitchen.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foodOrder")
public class FoodOrderController {


    @Autowired
    private  OrderdetailRepository orderdetailRepository;


    @GetMapping("/get_food_orderdetail_list")
    public ResultVO<List<Orderdetail>> findListDetails(String orderId){
        List<Orderdetail> orderdetailList = orderdetailRepository.findOrderdetailsByOrderId(orderId);
        if (orderdetailList.size() == 0) return ResultUtil.error(404,"not found the order details");
        return ResultUtil.success(orderdetailList);
    }




}
