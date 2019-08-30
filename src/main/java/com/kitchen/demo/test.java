package com.kitchen.demo;

import com.kitchen.demo.model.Buyfood;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Object object = new Buyfood();
        Object object1 = new Integer(21);
        List<Object> list = new ArrayList<>();;
        list.add(object);
        list.add(object1);
        System.out.println((Integer)(list.get(1)));
    }

}
