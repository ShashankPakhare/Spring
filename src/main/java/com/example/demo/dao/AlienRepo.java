package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alien;

import java.util.List;

@Repository
public interface AlienRepo extends MongoRepository<Alien,Integer> {
	
	List<Alien> findByAname(String aname);
	Alien findByAid(int aid);
	
	@DeleteQuery
    void deleteByAid(int aid);
	
	
}
