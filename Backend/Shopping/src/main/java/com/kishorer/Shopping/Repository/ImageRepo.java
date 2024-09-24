package com.kishorer.Shopping.Repository;


import com.kishorer.Shopping.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Images,Long> {
}
