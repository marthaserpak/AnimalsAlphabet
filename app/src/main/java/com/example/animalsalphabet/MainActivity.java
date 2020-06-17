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
                /* "Gg - Giraffe",
                 "Hh - Hippopotamus",
                 "Ii - Iguana",
                 "Jj - Jellyfish",
                 "Kk - Kangaroo",
                 "Ll - Lion",
                 "Mm - Monkey",
               /*  "Nn - Nutria",
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
        pickerAnimals.setMaxValue(animalsList.length - 1);
    }

    public void discover(View view) {
        int choice = pickerAnimals.getValue();

        if(choice == 0) {
            imageAnimal.setImageResource(R.drawable.letter_a);
        } else if (choice == 1) {
            imageAnimal.setImageResource(R.drawable.letter_b);
        } else if (choice == 2) {
            imageAnimal.setImageResource(R.drawable.ltr_c);
        } else if (choice == 3) {
            imageAnimal.setImageResource(R.drawable.ltr_d);
        } else if (choice == 4) {
            imageAnimal.setImageResource(R.drawable.ltr_e);
        }
    }
}