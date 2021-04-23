package com.example.demoKot.service


import com.example.demoKot.model.CreateProductRequest
import com.example.demoKot.model.ListProductRequest
import com.example.demoKot.model.ProductResponse
import com.example.demoKot.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest) : ProductResponse

    fun get(id: String) : ProductResponse

    fun update(id : String,updateProductRequest: UpdateProductRequest) : ProductResponse

    fun delete(id : String)

    fun list(listProductRequest: ListProductRequest) : List<ProductResponse>

}