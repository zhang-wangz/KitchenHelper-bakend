package com.kitchen.demo.service.impl;

import com.kitchen.demo.model.Buyfood;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuyFoodServiceimplTest {


    @Autowired
    private BuyFoodServiceimpl buyFoodServiceimpl;

    @Test
    public void findBuyOrderByFoodId() {

    }

    @Test
    public void loadDetailByOrderId() {
        List<Buyfood> buyfood = buyFoodServiceimpl.loadDetailByOrderId("1566715631262374737");
        System.out.println(buyfood.isEmpty());
    }

    @Test
    public void delOrderDetail() {
    }

    @Test
    public void cancelOrderDetail() {
    }

    @Test
    public void loadAll() {
    }

    @Test
    public void loadAllOnlyOne() {
    }

    @Test
    public void delOrder() {
    }

    @Test
    public void getBuyOrderCount() {
    }
}
