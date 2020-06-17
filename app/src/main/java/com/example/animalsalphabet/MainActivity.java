package com.example.animalsalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker pickerAnimals;
    ImageView imageAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pickerAnimals = findViewById(R.id.animalPicker);
        imageAnimal = findViewById(R.id.imageLetters);

        String[] animalsList = {
                "Aa - Alligator",
                "Bb - Bear",
                "Cc - Cat",
                "Dd - Dog",
                "Ee - Elephant",
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
                "Yy - Yak"
        };

        pickerAnimals.setDisplayedValues(animalsList);
        pickerAnimals.setMinValue(0);
        pickerAnimals.setMaxValue(animalsList.length - 1);
    }

    public void show_img(View view) {
        int choice = pickerAnimals.getValue();

        if (choice == 0) {
            imageAnimal.setImageResource(R.drawable.letter_a);
        } else if (choice == 1) {
            imageAnimal.setImageResource(R.drawable.letter_b);
        } else if (choice == 2) {
            imageAnimal.setImageResource(R.drawable.ltr_c);
        } else if (choice == 3) {
            imageAnimal.setImageResource(R.drawable.ltr_d);
        } else if (choice == 4) {
            imageAnimal.setImageResource(R.drawable.ltr_e);
        } else if (choice == 5) {
            imageAnimal.setImageResource(R.drawable.ltr_f);
        } else if (choice == 6) {
            imageAnimal.setImageResource(R.drawable.ltr_g);
        } else if (choice == 7) {
            imageAnimal.setImageResource(R.drawable.ltr_h);
        } else if (choice == 8) {
            imageAnimal.setImageResource(R.drawable.ltr_i);
        } else if (choice == 9) {
            imageAnimal.setImageResource(R.drawable.ltr_j);
        } else if (choice == 10) {
            imageAnimal.setImageResource(R.drawable.ltr_k);
        } else if (choice == 11) {
            imageAnimal.setImageResource(R.drawable.ltr_l);
        } else if (choice == 12) {
            imageAnimal.setImageResource(R.drawable.ltr_m);
        } else if (choice == 13) {
            imageAnimal.setImageResource(R.drawable.ltr_n);
        } else if (choice == 14) {
            imageAnimal.setImageResource(R.drawable.ltr_o);
        } else if (choice == 15) {
            imageAnimal.setImageResource(R.drawable.ltr_p);
        } else if (choice == 16) {
            imageAnimal.setImageResource(R.drawable.ltr_q);
        } else if (choice == 17) {
            imageAnimal.setImageResource(R.drawable.ltr_r);
        } else if (choice == 18) {
            imageAnimal.setImageResource(R.drawable.ltr_s);
        } else if (choice == 19) {
            imageAnimal.setImageResource(R.drawable.ltr_t);
        } else if (choice == 20) {
            imageAnimal.setImageResource(R.drawable.ltr_u);
        } else if (choice == 21) {
            imageAnimal.setImageResource(R.drawable.ltr_v);
        } else if (choice == 22) {
            imageAnimal.setImageResource(R.drawable.ltr_w);
        } else if (choice == 23) {
            imageAnimal.setImageResource(R.drawable.ltr_x);
        }  else if (choice == 24) {
            imageAnimal.setImageResource(R.drawable.ltr_y);
        } else if (choice == 25) {
            imageAnimal.setImageResource(R.drawable.ltr_z);
        }
    }
}