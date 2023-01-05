package com.example.imageinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView onlineImage1,onlineImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineImage1 = findViewById(R.id.imageView);
        onlineImage2 = findViewById(R.id.imageView2);

        String uri = "https://upload.wikimedia.org/wikipedia/commons/4/4f/World_topic_image_Satellite_image.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineImage1);

        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineImage2);

    }
}