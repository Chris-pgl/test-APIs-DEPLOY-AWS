package test_Api.api_test_online.controller;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test_Api.api_test_online.entity.Product;
import test_Api.api_test_online.service.Service;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    Service service;

    @PostMapping("product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product p){
        service.saveProduct(p);
        return ResponseEntity.ok(p);
    }

    @GetMapping("product")
    public ResponseEntity<List<Product>> getAllProduct(){
        List l = service.getAllProduct();
        return ResponseEntity.ok(l);
    }

    @GetMapping("product/{id}")
    public ResponseEntity<Optional<Product>> getProductByID(@PathVariable Long id){
        Optional<Product> p = service.getProductByID(id);
        return ResponseEntity.ok(p);
    }
    
    @PutMapping("product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product pDetail){
        Product updateProduct = service.updateProduct(id, pDetail);
        if(updateProduct == null){
            throw new RuntimeException("Product with " + id + " not found.");
        }
        return ResponseEntity.ok(updateProduct);
    }

    @DeleteMapping("product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return ResponseEntity.ok("Deleted successful");
    }

}
