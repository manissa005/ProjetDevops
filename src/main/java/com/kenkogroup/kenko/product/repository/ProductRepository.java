package com.kenkogroup.kenko.repository;

import com.kenkogroup.kenko.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

    void deleteByName(String name);
}
