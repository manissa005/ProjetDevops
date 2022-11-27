/*package com.kenkogroup.kenko.product.service;

import com.kenkogroup.kenko.product.entity.Product;
import com.kenkogroup.kenko.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProduct(List<Product> products){
        return repository.saveAll(products);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(String name){
       repository.deleteByName(name);
       return "product deleted!"+name;
    }
    public Product updateProduct(Product product){
     Product existingProduct=repository.findByName(product.getName());
     existingProduct.setName(product.getName());
     existingProduct.setCategory(product.getCategory());
     return repository.save(existingProduct);
    }
}

*/