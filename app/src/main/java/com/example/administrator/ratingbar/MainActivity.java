package com.example.administrator.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        RatingBar rb = (RatingBar) findViewById(R.id.rb);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            /**
             * @param ratingBar
             * @param rating 等级
             * @param fromUser
             */
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });
    }
}
