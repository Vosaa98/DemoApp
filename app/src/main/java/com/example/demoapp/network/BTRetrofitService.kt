package com.example.demoapp.network

import com.example.demoapp.paging3.ObjectMovie
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://bth-rest-live.ridgemax.co"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface BTApiService {
    @GET("/videos")
    suspend fun getMovies(
        @Query("playlistId") playlistId: String,
        @Query("maxResults") count: Int
    ): Response<ObjectMovie>
}

object BTApi {
    val retrofitService: BTApiService by lazy {
        retrofit.create(BTApiService::class.java)
    }
}