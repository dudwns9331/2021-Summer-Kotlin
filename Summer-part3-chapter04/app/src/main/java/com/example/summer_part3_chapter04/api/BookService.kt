package com.example.summer_part3_chapter04.api

import com.example.summer_part3_chapter04.model.BestSellerDto
import com.example.summer_part3_chapter04.model.SearchBookDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// 인터파크 API CBFD6A58325408991A9CE0DF6C3236AD388BFC548B7961C099E97EED51F03B65 인증키

interface BookService {
    @GET("api/search.api?output=json")
    fun getBooksByName(
        @Query("key") apiKey: String,
        @Query("query") keyword: String
    ): Call<SearchBookDto>

    @GET("api/bestSeller.api?output=json&categoryId=100")
    fun getBestSellerBooks(
        @Query("key") apiKey: String,
    ): Call<BestSellerDto>
}