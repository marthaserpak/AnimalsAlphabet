package com.example.animalsalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker pickerAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pickerAnimals = findViewById(R.id.animalPicker);

        String[] animalsList = {
                "Aa - Alligator",
                /* "Bb - Bear",
                 "Cc - Cat",
                 "Dd - Dog",
               /*"Ee - Elephant",
                 "Ff - Fish",
                 "Gg - Giraffe",
                 "Hh - Hippopotamus",
                 "Ii - Iguana",
                 "Jj - Jellyfish",
                 "Kk - Kangaroo",
                 "Ll - Lion",
                 "Mm - Monkey",
                 "Nn - Nutria",
                 "Oo - Owl",
                 "Pp - Pig",
                 "Qq - Quail",
                 "Rr - Rabbit",
                 "Ss - Snail",
                 "Tt - Turtle",
                 "Uu - Unicorn",
                 "Vv - Viper",
                 "Ww - Whale",
                 "Xx - Xenarthra",
                 "Yy - Yak"*/
        };

        pickerAnimals.setDisplayedValues(animalsList);
        pickerAnimals.setMinValue(0);
        pickerAnimals.setMaxValue(animalsList.length -1);
    }

    public void discover(View view) {

        int choice = pickerAnimals.getValue();

        if (choice == 0) {
            int ltrA = R.drawable.letter_a;
            Intent alligator = new Intent(getApplicationContext(), DetailActivity.class);
            alligator.putExtra("imgLtrA", ltrA);
            startActivity(alligator);
        }/* else if (choice == 1) {
            int ltrB = R.drawable.letter_b;
            Intent bear = new Intent(getApplicationContext(), DetailActivity.class);
            bear.putExtra("imgLtrB", ltrB);
            startActivity(bear);
        } else if (choice == 2) {
            int ltrC = R.drawable.ltr_c;
            Intent cat = new Intent(getApplicationContext(), DetailActivity.class);
            cat.putExtra("imgLtrC", ltrC);
            startActivity(cat);
        } else if (choice == 3) {
            int ltrD = R.drawable.ltr_d;
            Intent dog = new Intent(getApplicationContext(), DetailActivity.class);
            dog.putExtra("imgLtrD", ltrD);
            startActivity(dog);
        }*//* else if (choice == 4) {
            int ltrE = R.drawable.ltr_e;
            Intent elephant = new Intent(getApplicationContext(), DetailActivity.class);
            elephant.putExtra("imgLtrE", ltrE);
            startActivity(elephant);
        } else if (choice == 5) {
            int ltrF = R.drawable.ltr_f;
            Intent fish = new Intent(getApplicationContext(), DetailActivity.class);
            fish.putExtra("imgLtrF", ltrF);
            startActivity(fish);
        } else if (choice == 6) {
            int ltrG = R.drawable.ltr_g;
            Intent giraffe = new Intent(getApplicationContext(), DetailActivity.class);
            giraffe.putExtra("imgLtrG", ltrG);
            startActivity(giraffe);
        } else if (choice == 7) {
            int ltrH = R.drawable.ltr_h;
            Intent hippopotamus = new Intent(getApplicationContext(), DetailActivity.class);
            hippopotamus.putExtra("imgLtrH", ltrH);
            startActivity(hippopotamus);
        } else if (choice == 8) {
            int ltrI = R.drawable.ltr_i;
            Intent iguana = new Intent(getApplicationContext(), DetailActivity.class);
            iguana.putExtra("imgLtrI", ltrI);
            startActivity(iguana);
        } else if (choice == 9) {
            int ltrJ = R.drawable.ltr_j;
            Intent jellyfish = new Intent(getApplicationContext(), DetailActivity.class);
            jellyfish.putExtra("imgLtrJ", ltrJ);
            startActivity(jellyfish);
        } else if (choice == 10) {
            int ltrK = R.drawable.ltr_k;
            Intent kangaroo = new Intent(getApplicationContext(), DetailActivity.class);
            kangaroo.putExtra("imgLtrK", ltrK);
            startActivity(kangaroo);
        } else if (choice == 11) {
            int ltrL = R.drawable.ltr_l;
            Intent lion = new Intent(getApplicationContext(), DetailActivity.class);
            lion.putExtra("imgLtrL", ltrL);
            startActivity(lion);
        } else if (choice == 12) {
            int ltrM = R.drawable.ltr_m;
            Intent monkey = new Intent(getApplicationContext(), DetailActivity.class);
            monkey.putExtra("imgLtrM", ltrM);
            startActivity(monkey);
        } else if (choice == 13) {
            int ltrN = R.drawable.ltr_n;
            Intent nutria = new Intent(getApplicationContext(), DetailActivity.class);
            nutria.putExtra("imgLtrN", ltrN);
            startActivity(nutria);
        } else if (choice == 14) {
            int ltrO = R.drawable.ltr_o;
            Intent owl = new Intent(getApplicationContext(), DetailActivity.class);
            owl.putExtra("imgLtrO", ltrO);
            startActivity(owl);
        } else if (choice == 15) {
            int ltrP = R.drawable.ltr_p;
            Intent pig = new Intent(getApplicationContext(), DetailActivity.class);
            pig.putExtra("imgLtrP", ltrP);
            startActivity(pig);
        } else if (choice == 16) {
            int ltrQ = R.drawable.ltr_q;
            Intent quail = new Intent(getApplicationContext(), DetailActivity.class);
            quail.putExtra("imgLtrQ", ltrQ);
            startActivity(quail);
        } else if (choice == 17) {
            int ltrR = R.drawable.ltr_r;
            Intent rabbit = new Intent(getApplicationContext(), DetailActivity.class);
            rabbit.putExtra("imgLtrR", ltrR);
            startActivity(rabbit);
        } else if (choice == 18) {
            int ltrS = R.drawable.ltr_s;
            Intent snail = new Intent(getApplicationContext(), DetailActivity.class);
            snail.putExtra("imgLtrS", ltrS);
            startActivity(snail);
        } else if (choice == 19) {
            int ltrT = R.drawable.ltr_t;
            Intent turtle = new Intent(getApplicationContext(), DetailActivity.class);
            turtle.putExtra("imgLtrT", ltrT);
            startActivity(turtle);
        } else if (choice == 20) {
            int ltrU = R.drawable.ltr_u;
            Intent unicorn = new Intent(getApplicationContext(), DetailActivity.class);
            unicorn.putExtra("imgLtrU", ltrU);
            startActivity(unicorn);
        } else if (choice == 21) {
            int ltrV = R.drawable.ltr_v;
            Intent viper = new Intent(getApplicationContext(), DetailActivity.class);
            viper.putExtra("imgLtrV", ltrV);
            startActivity(viper);
        } else if (choice == 22) {
            int ltrW = R.drawable.ltr_w;
            Intent whale = new Intent(getApplicationContext(), DetailActivity.class);
            whale.putExtra("imgLtrW", ltrW);
            startActivity(whale);
        } else if (choice == 23) {
            int ltrX = R.drawable.ltr_x;
            Intent xenarthra = new Intent(getApplicationContext(), DetailActivity.class);
            xenarthra.putExtra("imgLtrX", ltrX);
            startActivity(xenarthra);
        } else if (choice == 24) {
            int ltrY = R.drawable.ltr_y;
            Intent yak = new Intent(getApplicationContext(), DetailActivity.class);
            yak.putExtra("imgLtrY", ltrY);
            startActivity(yak);
        } else if (choice == 25) {
            int ltrZ = R.drawable.ltr_z;
            Intent zebra = new Intent(getApplicationContext(), DetailActivity.class);
            zebra.putExtra("imgLtrZ", ltrZ);
            startActivity(zebra);
        }*/
    }
}