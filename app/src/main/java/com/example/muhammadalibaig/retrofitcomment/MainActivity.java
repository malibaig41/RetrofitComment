package com.example.muhammadalibaig.retrofitcomment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.muhammadalibaig.retrofitcomment.model.Comment;
import com.example.muhammadalibaig.retrofitcomment.model.CommentAsync;

public class MainActivity extends AppCompatActivity implements CommentAsync.OnCommentReceived {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommentAsync async = new CommentAsync();
        async.setOnCommentReceived(this);
        async.getComment();
    }


    @Override
    public void commentReceived(Comment comment) {
        Log.d(TAG, "commentReceived() called with: " + "comment = [" + comment + "]");

        String text = "Comment ID:" + comment.getId()
                + "\nComment Task ID:" + comment.getTaskId()
                + "\nComment TimeStamp:" + comment.getTimeStamp()
                + "\nComment:" + comment.getComment();


        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(text);
    }

    @Override
    public void commentNotReceived(String error) {

    }
}
