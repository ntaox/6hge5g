package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
public class MainActivity extends AppCompatActivity {
    private final static String PHOTO_URL = "http://cinema.areas.su/up/images/";
    TextView textView;
    ImageView preview;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);


    }
}