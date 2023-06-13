package com.example.retrofit_getapi.Network

import com.example.retrofit_getapi.ApiResponse
import com.example.retrofit_getapi.ResponseDataDeleteMahasiswa
import com.example.retrofit_getapi.ResponseDataInsertMahasiswa
import com.example.retrofit_getapi.ResponseDataUpdateMahasiswa
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("datamahasiswa/")
    //end poin URL dipanggil disini
    fun remoteGetdatamahasiswa(): Call<ApiResponse>
    @FormUrlEncoded

    @POST("datamahasiswa/")
    fun insertMahasiswa(
        @Field("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataInsertMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteMahasiswa(@Path("nim") nim: String): Call<ResponseDataDeleteMahasiswa>

    @FormUrlEncoded

    @POST("datamahasiswa/{nim}")
    fun updateMahasiswa(
        @Path("nim") nim: String,
        @Field("nama") nama: String,
        @Field("telepon") telepon: String
    ): Call<ResponseDataUpdateMahasiswa>
}
//tempat untuk menampung end poin dari URL (datamahasiswa/)