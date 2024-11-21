package com.abhiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.abhiClasses.DMS.Models.Dog;


/*
 * @author Abhinandhu Eppakayala
 * 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
