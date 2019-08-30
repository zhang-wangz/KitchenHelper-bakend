package com.kitchen.demo.service;

import com.kitchen.demo.model.Buyfood;
import com.kitchen.demo.util.BaseException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.*;


public interface BuyFoodService {

    List<Buyfood> loadBuyDetailByOrderId(String orderId);

    List<Buyfood> findOrderById(String id) throws BaseException;

    List<Buyfood> findBuyOrderByFoodId(String foodid);

    List<Buyfood> loadDetailByOrderId(String orderId);

    void delOrderDetail(Buyfood detail);

    void cancelOrderDetail(Buyfood detail);

    List<String> loadAllOnlyOne();


    void delOrder(String orderId);

    int getBuyOrderCount(Integer cate1);

    List<Buyfood> loadAll();

}
