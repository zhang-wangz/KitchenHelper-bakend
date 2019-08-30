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
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood b where b.BuyOrderId = :id");
        query.setParameter("id", orderId);
        List<Buyfood> list = query.list();
        tx.commit();
        session.close();
        return list;
    }

    public  List<Buyfood> findOrderById(String id) throws BaseException {

        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood b where b.BuyOrderId = :id");
        query.setParameter("id", id);
        if(query.list().size()==0){
            throw new BaseException("�ɹ���������");
        }
        List<Buyfood> order  = query.list();
        tx.commit();
        session.close();
        return  order;
    }

    public  List<Buyfood> findBuyOrderByFoodId(String foodid){

        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood b where b.foodId = :id");
        query.setParameter("id", foodid);
        if(query.list().size()==0) return null;

        List<Buyfood> order  = query.list();
        tx.commit();
        session.close();
        return  order;

    }



    public List<Buyfood> loadDetailByOrderId(String orderId) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood b where b.BuyOrderId = :id");
        query.setParameter("id", orderId);
        List<Buyfood> list = query.list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public void delOrderDetail(Buyfood detail) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("delete Buyfood b where b.foodId = :foodId and b.BuyOrderId = :orderId");
        query.setParameter("foodId", detail.getFoodId());
        query.setParameter("orderId", detail.getBuyOrderId());
        query.executeUpdate();

        tx.commit();
        session.close();
    }


    public void cancelOrderDetail(Buyfood detail) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("delete from  Buyfood b where b.foodId = :foodId and b.BuyOrderId = :orderId");
        query.setParameter("foodId", detail.getFoodId());
        query.setParameter("orderId", detail.getBuyOrderId());
        query.executeUpdate();

        query = session.createQuery("update BeanFoodInfo b set b.foodNum = b.foodNum -:num where foodId =:foodId");
        query.setParameter("num",detail.getNum());
        query.setParameter("foodId",detail.getFoodId());

        query.executeUpdate();

        tx.commit();
        session.close();
    }


    public List<Buyfood> loadAll(){
        List<Buyfood> lsit = null;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood ");
        lsit = query.list();
        tx.commit();
        session.close();
        return lsit;
    }

    public List<String> loadAllOnlyOne(){
        List<String> lsit = null;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createSQLQuery("select distinct buy_order_id from buyfood");
        lsit = query.list();
        tx.commit();
        session.close();
        return lsit;
    }


    public void delOrder(String orderId){
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("delete from Buyfood  b where b.BuyOrderId  = :orderid");
        query.setParameter("orderid",orderId);
        query.executeUpdate();
        tx.commit();
    }
    public int getBuyOrderCount(Integer cate1){
        Session session = getSession();
        Transaction rx = session.beginTransaction();
        Query query = session.createQuery("from Buyfood b where b.status = :cate");
        query.setParameter("cate",cate1);
        int size = query.list().size();
        rx.commit();
        session.close();
        return size;
    }


}

