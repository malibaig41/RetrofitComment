package com.example.muhammadalibaig.retrofitcomment.model;

import com.google.gson.annotations.SerializedName;


public class Comment {

    @SerializedName("id")
    private int mId;

    @SerializedName("task_id")
    private String mTaskId;

    @SerializedName("timestamp")
    private String mTimeStamp;

    @SerializedName("comment")
    private String mComment;

    @SerializedName("user")
    private User mUser;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTaskId() {
        return mTaskId;
    }

    public void setTaskId(String taskId) {
        mTaskId = taskId;
    }

    public String getTimeStamp() {
        return mTimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        mTimeStamp = timeStamp;
    }

    public String getComment() {
        return mComment;
    }

    public void setComment(String comment) {
        mComment = comment;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }
}
