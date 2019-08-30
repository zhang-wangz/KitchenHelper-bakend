package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Orderdetail;

public interface OrderdetailRepository extends JpaRepository<Orderdetail, String>, JpaSpecificationExecutor<Orderdetail> {

}