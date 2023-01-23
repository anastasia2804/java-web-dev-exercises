package launchcode.practice;

import java.util.Arrays;

public class StringMethod {
    public static void main (String[] args) {

//        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] wordsArray = myString.split(" ");
//
//        System.out.println(Arrays.toString(wordsArray));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
