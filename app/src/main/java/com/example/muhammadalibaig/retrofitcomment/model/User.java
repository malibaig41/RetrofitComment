package com.example.muhammadalibaig.retrofitcomment.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Muhammad Ali Baig on 8/27/2016.
 */
public class User {
    @SerializedName("id")
    private int mId;

    @SerializedName("firstname")
    private String mFirstName;

    @SerializedName("lastname")
    private String mLastName;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }


}
