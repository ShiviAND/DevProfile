package com.example.retrofitcallback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNews()
    }

    private fun getNews() {
        val news=NewsService.newsInstance.getHeadLines("in",1)
        news.enqueue(object :Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {

                val news=response.body()
                if(news!=null){
                    Log.d("Cheezyc",news.toString())
                }

            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d("Cheezyc","Error in fetching News",t)
            }

        })
    }
}