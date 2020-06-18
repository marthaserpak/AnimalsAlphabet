package com.example.animalsalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer lettersPronunciation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        lettersPronunciation = MediaPlayer.create(this, R.raw.);

        }

    public void letterA(View view) {

    }

}