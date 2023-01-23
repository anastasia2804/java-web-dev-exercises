package launchcode.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordLengthMatch {
    public static void matchStringLength (ArrayList<String> arr) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word length");
        int wordLength = scanner.nextInt();

        for (String element : arr ){
            if(element.length() == wordLength) {
                System.out.println(element);
            }
        }

    }

    public static void main (String[] args) {
        ArrayList<String> mylist = new ArrayList<>(List.of("a", "b", "param", "tadam"));


        matchStringLength(mylist);



    }
}
