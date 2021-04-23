package com.example.demoKot.repository


import com.example.demoKot.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product,String>{

}