package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Images.Images;
@Repository
public interface ImagesRepo extends JpaRepository<Images, Long>{

}
