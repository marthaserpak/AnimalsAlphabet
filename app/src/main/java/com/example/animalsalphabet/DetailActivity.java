package com.example.animalsalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.img_letter);

        Intent ltrA = getIntent();
        ltrA.getExtras();
        int imgLtrA = getIntent().getIntExtra("imgLtrA", 0);
        imageView.setImageResource(imgLtrA);

       /* Intent ltrB = getIntent();
        ltrB.getExtras();
        int imgLtrB = getIntent().getIntExtra("imgLtrB", 0);
        imageView.setImageResource(imgLtrB);

        Intent ltrC = getIntent();
        ltrC.getExtras();
        int imgLtrC = getIntent().getIntExtra("imgLtrC", 0);
        imageView.setImageResource(imgLtrC);


        Intent ltrD = getIntent();
        ltrD.getExtras();
        int imgLtrD = getIntent().getIntExtra("imgLtrD", 0);
        imageView.setImageResource(imgLtrD);

        Intent ltrE = getIntent();
        ltrE.getExtras();
        int imgLtrE = getIntent().getIntExtra("imgLtrE", 0);
        imageView.setImageResource(imgLtrE);

        Intent ltrF = getIntent();
        ltrF.getExtras();
        int imgLtrF = getIntent().getIntExtra("imgLtrF", 0);
        imageView.setImageResource(imgLtrF);

        Intent ltrG = getIntent();
        ltrG.getExtras();
        int imgLtrG = getIntent().getIntExtra("imgLtrG", 0);
        imageView.setImageResource(imgLtrG);

        Intent ltrH = getIntent();
        ltrH.getExtras();
        int imgLtrH = getIntent().getIntExtra("imgLtrH", 0);
        imageView.setImageResource(imgLtrH);

        Intent ltrI = getIntent();
        ltrI.getExtras();
        int imgLtrI = getIntent().getIntExtra("imgLtrI", 0);
        imageView.setImageResource(imgLtrI);

        Intent ltrJ = getIntent();
        ltrJ.getExtras();
        int imgLtrJ = getIntent().getIntExtra("imgLtrJ", 0);
        imageView.setImageResource(imgLtrJ);

        Intent ltrK = getIntent();
        ltrK.getExtras();
        int imgLtrK = getIntent().getIntExtra("imgLtrK", 0);
        imageView.setImageResource(imgLtrK);

        Intent ltrL = getIntent();
        ltrL.getExtras();
        int imgLtrL = getIntent().getIntExtra("imgLtrL", 0);
        imageView.setImageResource(imgLtrL);

        Intent ltrM = getIntent();
        ltrM.getExtras();
        int imgLtrM = getIntent().getIntExtra("imgLtrM", 0);
        imageView.setImageResource(imgLtrM);

        Intent ltrN = getIntent();
        ltrN.getExtras();
        int imgLtrN = getIntent().getIntExtra("imgLtrN", 0);
        imageView.setImageResource(imgLtrN);

        Intent ltrO = getIntent();
        ltrO.getExtras();
        int imgLtrO = getIntent().getIntExtra("imgLtrO", 0);
        imageView.setImageResource(imgLtrO);

        Intent ltrP = getIntent();
        ltrP.getExtras();
        int imgLtrP = getIntent().getIntExtra("imgLtrP", 0);
        imageView.setImageResource(imgLtrP);

        Intent ltrQ = getIntent();
        ltrQ.getExtras();
        int imgLtrQ = getIntent().getIntExtra("imgLtrQ", 0);
        imageView.setImageResource(imgLtrQ);

        Intent ltrR = getIntent();
        ltrR.getExtras();
        int imgLtrR = getIntent().getIntExtra("imgLtrR", 0);
        imageView.setImageResource(imgLtrR);

        Intent ltrS = getIntent();
        ltrS.getExtras();
        int imgLtrS = getIntent().getIntExtra("imgLtrS", 0);
        imageView.setImageResource(imgLtrS);

        Intent ltrT = getIntent();
        ltrT.getExtras();
        int imgLtrT = getIntent().getIntExtra("imgLtrT", 0);
        imageView.setImageResource(imgLtrT);

        Intent ltrU = getIntent();
        ltrU.getExtras();
        int imgLtrU = getIntent().getIntExtra("imgLtrU", 0);
        imageView.setImageResource(imgLtrU);

        Intent ltrV = getIntent();
        ltrV.getExtras();
        int imgLtrV = getIntent().getIntExtra("imgLtrV", 0);
        imageView.setImageResource(imgLtrV);

        Intent ltrW = getIntent();
        ltrW.getExtras();
        int imgLtrW = getIntent().getIntExtra("imgLtrW", 0);
        imageView.setImageResource(imgLtrW);

        Intent ltrX = getIntent();
        ltrX.getExtras();
        int imgLtrX = getIntent().getIntExtra("imgLtrX", 0);
        imageView.setImageResource(imgLtrX);

        Intent ltrY = getIntent();
        ltrY.getExtras();
        int imgLtrY = getIntent().getIntExtra("imgLtrY", 0);
        imageView.setImageResource(imgLtrY);

        Intent ltrZ = getIntent();
        ltrZ.getExtras();
        int imgLtrZ = getIntent().getIntExtra("imgLtrZ", 0);
        imageView.setImageResource(imgLtrZ);*/
    }
}