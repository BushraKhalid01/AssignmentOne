package org.haqnawaz.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CountingActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);
    }

    public void soundAndAnimation1(View view) {
        ImageView img1=findViewById(R.id.imageView14);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.one);
        mp.setVolume(0f,1f);
        mp.start();

    }

    public void soundAndAnimation2(View view) {
        ImageView img1=findViewById(R.id.imageView15);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.two);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation3(View view) {
        ImageView img1=findViewById(R.id.imageView16);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.three);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation4(View view) {
        ImageView img1=findViewById(R.id.imageView17);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.four);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation5(View view) {
        ImageView img1=findViewById(R.id.imageView18);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.five);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation6(View view) {
        ImageView img1=findViewById(R.id.imageView19);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.six);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation7(View view) {
        ImageView img1=findViewById(R.id.imageView20);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.seven);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation8(View view) {
        ImageView img1=findViewById(R.id.imageView21);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.eight);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation9(View view) {
        ImageView img1=findViewById(R.id.imageView22);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.nine);
        mp.setVolume(0f,1f);
        mp.start();
    }
    public void soundAndAnimation10(View view) {
        ImageView img1=findViewById(R.id.imageView23);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        img1.startAnimation(animation1);
        mp=MediaPlayer.create(this,R.raw.ten);
        mp.setVolume(0f,1f);
        mp.start();
    }

}