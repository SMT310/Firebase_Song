package com.example.firebase_song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playSong (View view){
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/fir-song-e84e3.appspot.com/o/YeuAnhDiMeAnhBanBanhMi-PhucDu-8698703.mp3?alt=media&token=8c035e0d-1109-47f3-9244-2fd14e426545");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}