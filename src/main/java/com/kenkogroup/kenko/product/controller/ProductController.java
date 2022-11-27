/*package com.kenkogroup.kenko.product.controller;
import com.kenkogroup.kenko.product.entity.Product;
import com.kenkogroup.kenko.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping ("/getProducts")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping ("/getProduct/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping ("/getProduct/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @PutMapping ("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product); }
    @DeleteMapping ("/deleteProduct/{name}")
    public String deleteProduct(@PathVariable String name) {
        return service.deleteProduct(name);
    }
}
*/