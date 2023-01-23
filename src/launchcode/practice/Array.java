package launchcode.practice;

public class Array {
    public static void main(String[] args) {

    int[] numbers = {1, 1, 2, 3, 5, 8};

    //print odd numbers
    for(int i :numbers) {
        if(i % 2 != 0) {
            System.out.println(i);
        }
    }
}
}
