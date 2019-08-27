package Java4week;

import Exercises.ArrayMethodExercises;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5,6,7,8,9};
        String[] array2 = {"one", "two", "three", "four", "five","six", "seven", "eight", "nine"};
        Arrays myArray = new Arrays();
        System.out.println(myArray.returnIndex(array1, 5));

        Arrays myArray2 = new Arrays();
        System.out.println(myArray2.returnIndex(array2, "four"));

        StatArrays myStat = new StatArrays();
        System.out.println("Returned index of 8: " + myStat.returnIndex(array1, 8));
        System.out.println("Returned string index of eight: "+myStat.returnIndex(array2, "eight"));
        System.out.println("Avarage: " +myStat.findAvarage(array1));
        System.out.println("Max value: " +myStat.findMaxValue(array1));
        System.out.println("Min value: " +myStat.findMinValue(array1));
    }
}
