package com.marsanix.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

    }


    public void setAnimation(View view) {
        String btnId = view.getResources().getResourceEntryName(view.getId());
        Log.i("btnId", btnId);

        switch (btnId) {
            case "btnFadeIn":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in));
                break;
            case "btnFadeOut":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out));
                break;

            case "btnZoomIn":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in));
                break;

            case "btnZoomOut":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out));
                break;

            case "btnRotate":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate));
                break;

            case "btnMove":
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move));
                break;
        }

    }
}