package com.kitchen.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.kitchen.demo.model.Recipebrow;

public interface RecipebrowRepository extends JpaRepository<Recipebrow, String>, JpaSpecificationExecutor<Recipebrow> {

}