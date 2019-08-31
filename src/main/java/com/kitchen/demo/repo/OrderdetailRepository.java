package com.kitchen.demo.repo;

import com.kitchen.demo.model.OrderdetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Orderdetail;

import java.util.List;

public interface OrderdetailRepository extends JpaRepository<Orderdetail, OrderdetailId>, JpaSpecificationExecutor<Orderdetail> {

    List<Orderdetail> findOrderdetailsByOrderId(String orderId);
}