package com.example.jibin2.jibin_reji_comp304lab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LauncherActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        imageView=(ImageView)findViewById(R.id.launcherImageView);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.launcher_animation);
        imageView.setAnimation(animation);
    }
    public void goToCuisineType(View view)
    {
        Intent nextPage=new Intent(LauncherActivity.this,CuisineTypeActivity.class);
        startActivity(nextPage);
    }
}
