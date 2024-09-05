package test_Api.api_test_online.service;


import org.springframework.beans.factory.annotation.Autowired;
import test_Api.api_test_online.entity.Product;
import test_Api.api_test_online.repository.Repository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repo;

    //C
    public Product saveProduct(Product p){
        return repo.save(p);
    }
    //R
    public List<Product> getAllProduct(){
        return repo.findAll();
    }
    //R2
    public Optional<Product> getProductByID(Long id){
        return repo.findById(id);
    }
    //U
    public Product updateProduct(Long id, Product productDetail){
        Product p = repo.findById(id).orElseThrow(() -> new RuntimeException("Product not foud"));
        p.setProductName(productDetail.getProductName());
        p.setDescription(productDetail.getDescription());
        p.setPrice(productDetail.getPrice());
        return repo.save(p);
    }
    //D
    public void deleteProduct(Long id){
        repo.deleteById(id);
    }

}
