package com.example.animalsalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;




public class AudioActivity extends AppCompatActivity {

    MediaPlayer lettersPronunciation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        lettersPronunciation = MediaPlayer.create(getApplicationContext(), R.raw.alphabet_song);
    }

    public void btn_audio(View view) {

        lettersPronunciation.start();
    }

    public void shareApp(View view) {
        String message = "Try this app for kids!";
        Uri destination = Uri.parse("smsto:5554");
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, destination);
        smsIntent.putExtra("sms_body", message);
        startActivity(smsIntent);
    }
}