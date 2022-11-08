package com.kenkogroup.kenko.controller;

import com.kenkogroup.kenko.entity.Product;
import com.kenkogroup.kenko.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProduct(products);
    }
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    public String deleteProduct(@PathVariable String name) {
        return service.deleteProduct(name);
    }
}
