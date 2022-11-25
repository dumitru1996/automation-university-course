package lesson4.basics_of_programming;

import java.util.Arrays;

public class ArraysExamples {

    int[] simpleIntArray = {1,3,5}; // declaration, instantiation and initialization

    int myInt = simpleIntArray[0]; // assign to myInt value from myIntArray form index 0

    double[] arrayOfDoubles = {1.23,2.34};
    char[] arrayOfChars = {'a','2', '$', '\u4556'};
    String[] arrayOfStrings = {"John","Allice","Chris"};

    int a = 1, b = 2;
    int[] numbers = { a, b + a, simpleIntArray[0] * simpleIntArray[1] };

    public void arrayLength(){
        int[] myIntArray = new int[3]; //declaration and instantiation
        myIntArray[0] = 1; // initialization
        myIntArray[1] = 2;
        myIntArray[2] = 3;

//        System.out.println(myIntArray[4]); // IndexOutOfBound Exception

        int arrayLength = myIntArray.length; // length method returns array size
    }

    public void twoDimensionalArrayExample(){
        int[][] twoDimensionalArray = {{1,2,3},{2,3,4},{3,4,5}}; // two-dimensional array

        int[][] twoDimensionalArray2 = {
                {1,2,3},
                {2,3,4},
                {3,4,5}};
    }

    public void fillArray(){
        int size = 10;
        char[] charArr = new char[size];
        // Array.fill method can automatically fill array with defined values
        Arrays.fill(charArr,0, size /2, '1');
        Arrays.fill(charArr,size / 2, size, 'R');

        System.out.println(charArr);
    }

    public void arrayToString(){
        int[] myIntArray = {23,34,45,56};
        // Array.toString returns your array as a string
        String arrayToString = Arrays.toString(myIntArray);
        System.out.println(arrayToString);
    }

    public void sortArray(){
        int[] unsortedArray = {4,8,12,9,124,-22,0};
        Arrays.sort(unsortedArray);
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
    }
    public static void main(String[] args) {
    }
}
