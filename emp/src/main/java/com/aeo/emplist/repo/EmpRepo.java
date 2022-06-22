package com.aeo.emplist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.aeo.emplist.entity.EmpEntity;

public interface EmpRepo extends CrudRepository<EmpEntity, Integer> {

	
}
