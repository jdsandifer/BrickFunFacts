package com.jdsandifer.brickfunfacts;

import java.util.Random;

/**
 * Created by j.d. sandifer on 3/20/2015.
 */
public class FactBook {

    // Member variable (object properties)
    public String[] mFacts = {
            "The LEGO® name was created by combining the first two letters of the Danish words \"Leg\" and \"Godt,\" meaning \"play well.\"",
            "The LEGO Group is one of the world’s largest tire manufacturers.",
            "Each LEGO® minifigure is exactly four bricks tall without a hat.",
            "The LEGO Group was founded in 1932 in Denmark.",
            "A LEGO® brick from 1958 would still interlock with one made today.",
            "Even though they are eight times the size of regular bricks, LEGO DUPLO® bricks connect perfectly with the regular ones.",
            "The world's largest LEGO® tower stands 112 feet high and contains over 500,000 bricks.",
            "On average there are 86 LEGO® bricks for every person on earth."
    };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }

}
