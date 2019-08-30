package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Myuser;

public interface MyuserRepository extends JpaRepository<Myuser, String>, JpaSpecificationExecutor<Myuser> {

}