package com.example.muhammadalibaig.retrofitcomment.rest;

import com.example.muhammadalibaig.retrofitcomment.model.Comment;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Muhammad Ali Baig on 8/27/2016.
 */
public interface API {
    @GET("comments/{id}")
    Call<Comment> getComment();
}
