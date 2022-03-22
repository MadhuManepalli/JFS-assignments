package io.madhu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.madhu.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,String>  {

}
