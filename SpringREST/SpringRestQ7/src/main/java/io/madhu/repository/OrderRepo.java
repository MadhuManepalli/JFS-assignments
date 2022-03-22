package io.madhu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.madhu.model.Order;


@Repository
public interface OrderRepo extends MongoRepository<Order,String> {
	
}