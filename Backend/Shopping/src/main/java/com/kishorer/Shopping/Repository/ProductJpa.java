package com.kishorer.Shopping.Repository;

import com.kishorer.Shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJpa extends JpaRepository<Product,Long> {

}
