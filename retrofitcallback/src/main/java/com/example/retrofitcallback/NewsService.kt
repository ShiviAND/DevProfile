package com.example.retrofitcallback

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


//https://newsapi.org/v2/everything?q=apple&from=2022-08-14&to=2022-08-14&sortBy=popularity&apiKey=API_KEY
//https://newsapi.org/v2/top-headlines?country=in&apiKey=7c0065f7675f41f6949be808db286bc6
const val API_KEY="7c0065f7675f41f6949be808db286bc6"
const val BASE_URL="https://newsapi.org/"

interface NewsInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadLines(@Query("country")country:String, @Query("page")page:Int) : Call<News>

}

object NewsService{
    val newsInstance: NewsInterface
    init{
        val retrofit:Retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsInstance=retrofit.create(NewsInterface::class.java)
    }
}

