package com.example.muhammadalibaig.retrofitcomment.model;

import android.util.Log;

import com.example.muhammadalibaig.retrofitcomment.rest.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Muhammad Ali Baig on 8/27/2016.
 */
public class CommentAsync {
    public static final String TAG = CommentAsync.class.getSimpleName();

    private OnCommentReceived mCallback;

    public void getComment() {
        Call<Comment> call = RestClient.getAPI().getComment();

        call.enqueue(new Callback<Comment>() {
            @Override
            public void onResponse(Call<Comment> call, Response<Comment> response) {
                Log.d(TAG, "onResponse() called with: ");

//                Comment comment = response.body();
                mCallback.commentReceived(response.body());
            }

            @Override
            public void onFailure(Call<Comment> call, Throwable t) {
                Log.d(TAG, "onFailure() called with: " + "call = [" + call + "], t = [" + t + "]");
            }
        });
    }


    // Interface for success return of Comment
    public interface OnCommentReceived {
        void commentReceived(Comment comment);

        void commentNotReceived(String error);
    }

    public void setOnCommentReceived(OnCommentReceived c) {
        mCallback = c;
    }
}

