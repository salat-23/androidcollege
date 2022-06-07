package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView rotateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotateImage = findViewById(R.id.imageRotate);
    }

    public void btn_rotate(View view) {
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        rotateImage.startAnimation(rotate);
    }
}