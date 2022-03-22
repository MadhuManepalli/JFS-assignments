package io.madhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.madhu.model.Product;
import io.madhu.repository.ProductRepo;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return  productRepo.findAll();
    }

    public Product getProduct(String id) {
        return productRepo.findById(id).get();
    }

    public Product addProduct(Product product) {
        return productRepo.insert(product);
    }

    public boolean deleteProduct(String id) {
        productRepo.deleteById(id);
        return true;

    }

    public boolean updateProduct(Product product, String id) {

        if(productRepo.existsById(id)){
            productRepo.save(product);
            return true;
        }
        else
            return false;
    }
}
