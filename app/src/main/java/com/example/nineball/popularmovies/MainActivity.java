package com.example.nineball.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    // TODO 1: Display Grid arrangement of movie posters
    // TODO 1.1: Create FrameLayout for each movie poster
    // TODO 1.2: Get movie data from API
    // TODO 1.3:

    // TODO 2: Allow sort order changing: most popular or top rated
    // TODO 2.1: Create menu file with sort options
    // TODO 2.2: Inflate menu
    // TODO 2.3: Implement sorting

    /* TODO 3: Movie Poster Clicked
       TODO 3.1: Movie poster Onclick pass movie selection to details screen
       TODO 3.2: Inflate details screen

       TODO 4.0: Show movie details: title, image, plot synopsis, user rating, release date
        - original title
        - movie poster image thumbnail
        - A plot synopsis (called overview in the api)
        - user rating (called vote_average in the api)
        - release date
       TODO 4.1: Create layout for details
       TODO 4.2: Use passed movie selection to get movie details and pass to the layout elements
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView textView = (TextView) findViewById(R.id.testData);




}
