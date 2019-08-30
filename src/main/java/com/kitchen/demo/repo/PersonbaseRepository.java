package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


public abstract interface PersonbaseRepository extends JpaRepository<PersonDAO,String> {



}
