package com.kitchen.demo.repo;

import com.kitchen.demo.util.BaseException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Buyfood;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BuyfoodRepository extends JpaRepository<Buyfood, String>, JpaSpecificationExecutor<Buyfood> {


    @Modifying
    @Query(value = "from Buyfood b where b.BuyOrderId = :id")
    List<Buyfood> loadBuyDetailByOrderId(@Param("id")String id);

    @Modifying
    @Query(value = "from Buyfood b where b.BuyOrderId = :id")
    List<Buyfood> findOrderById(@Param("id") String id) throws BaseException;

    @Modifying
    @Query(value = "from Buyfood b where b.foodId = :id")
    List<Buyfood> findBuyOrderByFoodId(@Param("id")String foodid);


    @Modifying
    @Query(value = "from Buyfood b where b.BuyOrderId = :id")
    List<Buyfood> loadDetailByOrderId(@Param("id") String orderId);

    @Modifying
    @Query(value = "delete from Buyfood b where b.foodId = :foodId and b.BuyOrderId = :orderId")
    void delOrderDetail(@Param("foodId") String foodId,@Param("orderId") String orderId);

    @Modifying
    @Query(value = "delete from Buyfood b where b.foodId = :foodId and b.BuyOrderId = :orderId")
    void deleteBuyfoodsByBuyOrderIdAndAndFoodId();

    @Modifying
    @Query(value = "update FoodInfo b set b.foodNum = b.foodNum -:num where foodId =:foodId")
    void updateFoodInfoByFoodId();

}