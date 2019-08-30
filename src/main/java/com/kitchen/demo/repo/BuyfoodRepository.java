package com.kitchen.demo.repo;

import com.kitchen.demo.model.BuyfoodId;
import com.kitchen.demo.util.BaseException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Buyfood;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BuyfoodRepository extends JpaRepository<Buyfood, BuyfoodId>{


    List<Buyfood> findOrderByBuyOrderId(@Param("id") String id);


    List<Buyfood> findBuyOrderByFoodId(@Param("id")String foodId);


    @Modifying
    @Query(value = "delete from buyfood b where b.food_id = :foodId and b.buy_order_id = :orderId",nativeQuery = true)
    void delOrderDetail(@Param("foodId") String foodId,@Param("orderId") String orderId);

    @Modifying
    @Query(value = "delete from buyfood b where b.food_id = :foodId and b.buy_order_id = :orderId",nativeQuery = true)
    void deleteBuyfoodsByBuyOrderIdAndAndFoodId(@Param("foodId")String foodId,@Param("orderId")String orderId);

    @Modifying
    @Query(value = "update foodinfo b set b.food_num = b.food_num -:num where food_id =:foodId",nativeQuery = true)
    void updateFoodInfoByFoodId(@Param("num")Integer num,@Param("foodId")String foodId);

    List<Buyfood> findAll();

    @Modifying
    @Query(value = "select distinct buy_order_id from buyfood",nativeQuery = true)
    List<String> loadAllOnlyOne();

    void deleteBuyfoodByBuyOrderId(String orderId);


    @Modifying
    @Query(value = "select  count (buy_order_id) from buyfood b where b.status = :cate",nativeQuery = true)
    int getBuyOrderCount(@Param("cate") Integer cate1);







}