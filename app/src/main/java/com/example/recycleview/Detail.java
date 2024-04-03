package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btnShare = findViewById(R.id.btnShare);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String movieName = extras.getString("movie_name");
            String movieSynopsis = extras.getString("movie_synopsis");
            String movieDate = extras.getString("movie_date");
            String movieDirector = extras.getString("movie_director");
            int movieImage = extras.getInt("movie_image");

            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.textView2);
            TextView textView3 = findViewById(R.id.textView3);
            TextView textView4 = findViewById(R.id.textView4);
            ImageView imageView = findViewById(R.id.imageView);

            textView.setText(movieName);
            textView2.setText(movieSynopsis);
            textView3.setText(movieDate);
            textView4.setText(movieDirector);
            imageView.setImageResource(movieImage);

            btnShare.setOnClickListener(click -> {
                shareMovieDetails(movieName,movieDate,movieDirector);
            });
        }
    }

    private void shareMovieDetails(String movieName, String movieDate, String movieDirector) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Film: " + movieName + "\nRilis: " + movieDate + "\nSutradara: " + movieDirector);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}