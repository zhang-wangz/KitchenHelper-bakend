package com.kitchen.demo.service.impl;


import com.kitchen.demo.model.Buyfood;
import com.kitchen.demo.repo.BuyfoodRepository;
import com.kitchen.demo.service.BuyFoodService;
import com.kitchen.demo.util.BaseException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyFoodServiceimpl  implements BuyFoodService {

    @Autowired
    private BuyfoodRepository buyfoodRepository;

    public List<Buyfood> loadBuyDetailByOrderId(String orderId) {

        return buyfoodRepository.loadBuyDetailByOrderId(orderId);
    }


    public  List<Buyfood> findOrderById(String id) throws BaseException {


        return  buyfoodRepository.findOrderById(id);
    }

    public  List<Buyfood> findBuyOrderByFoodId(String foodid){

        return  findBuyOrderByFoodId(foodid);

    }



    public List<Buyfood> loadDetailByOrderId(String orderId) {

        return loadBuyDetailByOrderId(orderId);
    }

    @Override
    public void delOrderDetail(Buyfood detail) {
        buyfoodRepository.deleteBuyfoodsByBuyOrderIdAndAndFoodId(detail.getFoodId(),detail.getBuyOrderId());
    }


    public void cancelOrderDetail(Buyfood detail) {

        buyfoodRepository.deleteBuyfoodsByBuyOrderIdAndAndFoodId(detail.getFoodId(),detail.getBuyOrderId());
        buyfoodRepository.updateFoodInfoByFoodId(detail.getNum(),detail.getFoodId());

    }


    public List<Buyfood> loadAll(){

        return buyfoodRepository.findAll();
    }

    public List<String> loadAllOnlyOne(){

        return buyfoodRepository.loadAllOnlyOne();
    }


    public void delOrder(String orderId){

        buyfoodRepository.deleteBuyfoodByBuyOrderId(orderId);
    }
    public int getBuyOrderCount(Integer cate1){
        return  buyfoodRepository.getBuyOrderCount(cate1);
    }

    public static void main(String[] args) {
        BuyFoodServiceimpl buyFoodServiceimpl = new BuyFoodServiceimpl();
        List<Buyfood> list = buyFoodServiceimpl.loadAll();
        System.out.println(list.size());
    }



}

