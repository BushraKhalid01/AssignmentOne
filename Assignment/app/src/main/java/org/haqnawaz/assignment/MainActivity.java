package org.haqnawaz.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.background);
        mp.setLooping(true);
        mp.setVolume(0,0.2f);
        mp.start();

    }
    public  void onChangeActivity(View view){
        Intent intent=new Intent(this,CountingActivity.class);
        startActivity(intent);
    }
}