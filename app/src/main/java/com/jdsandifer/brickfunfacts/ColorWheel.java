package com.jdsandifer.brickfunfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by j.d. sandifer on 3/20/2015.
 */
public class ColorWheel {

    // Member variable (object properties)
    public String[] mColors = {
            "#faea0a",
            "#f72725",
            "#4690ec",
            "#37c461",
            "#939393",
            "#d6c386"
    }; // Colors are LEGO® Yellow, Red, Blue, Green, Med. Grey, and Tan

    // Method (abilities: things the object can do)
    public int getColor() {

        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}
