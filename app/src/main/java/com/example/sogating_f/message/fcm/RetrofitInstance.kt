package com.example.sogating_f.message.fcm

import com.example.sogating_f.message.fcm.Repo.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {

    companion object{
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory((GsonConverterFactory.create()))
                .build()
        }

        val api = retrofit.create(NotiAPI::class.java)

    }

}