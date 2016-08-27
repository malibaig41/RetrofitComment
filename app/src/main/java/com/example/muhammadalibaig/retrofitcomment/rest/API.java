package com.example.muhammadalibaig.retrofitcomment.rest;

import com.example.muhammadalibaig.retrofitcomment.model.Comment;

import retrofit2.Call;
import retrofit2.http.GET;


public interface API {
    @GET("comments/{id}")
    Call<Comment> getComment();

    @GET("tasks/{id}")
    Call<Comment> getTask();
}
