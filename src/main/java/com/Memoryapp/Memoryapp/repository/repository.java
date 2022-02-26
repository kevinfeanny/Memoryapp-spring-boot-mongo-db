package com.Memoryapp.Memoryapp.repository;

import com.Memoryapp.Memoryapp.Model.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface repository extends MongoRepository<List, String> {

   @Query(value = "{$and :[{Day: ?0},{Month: ?1}] }")
   ArrayList<List> findbyDayandMonth(int Day, int Month);

}
