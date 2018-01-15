package com.sivaram.imdb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 30/11/2017.
 */

public class MovieDetails extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
