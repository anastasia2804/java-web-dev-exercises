package launchcode.practice;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        System.out.println(myList);

        int sumOfEven = sumEven(myList);
        System.out.println(sumOfEven);


    }
}
