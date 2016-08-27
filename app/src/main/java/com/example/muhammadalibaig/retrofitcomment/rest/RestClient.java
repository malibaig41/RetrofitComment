package com.example.muhammadalibaig.retrofitcomment.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestClient {

    public static final String BASE_URL = "http://22olpqlwum5qrabnx-mock.stoplight-proxy.io/";

    private static Retrofit mRetrofit;
    private static API mAPI;

    public static API getAPI() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        if (mAPI == null) {
            mAPI = mRetrofit.create(API.class);
        }

        return mAPI;
    }
}
