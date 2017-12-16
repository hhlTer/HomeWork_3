package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean creatArray;
        int[] arrayInt = new int[0];
        do {
            System.out.println("Enter numbers, using space for separation");
            creatArray = true;
            String[] numbers = new Scanner(System.in).nextLine().split(" ");
            arrayInt = new int[numbers.length];
            try {
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = Integer.parseInt(numbers[i]);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Wrong format or double space typing");
                creatArray = false;
            }
        } while (!creatArray);

        System.out.printf("Minimum digit: %d\n", getMinimumFromArray(arrayInt));
        System.out.printf("Maximum digit: %d\n", getMaximumFromArray(arrayInt));
        System.out.printf("Count of repeats number 5: %d\n", countOfNumber(arrayInt, 5));
        System.out.println("Sort:");
        for (int a:
             sort(arrayInt)) {
            System.out.print((a) + " ");
        }
        System.out.println("\nMaximum count same of digits: " + countOfRepeat(arrayInt));
        System.out.println("Minimum count same of digits: " + countMinOfRepeat(arrayInt));
    }

    private static int countOfNumber(int[] array, int d){
        int count = 0;
        for (int anArray : array) {
            if (anArray == d) count++;
        }
        return count;
    }
    private static int getMinimumFromArray(int[] array){
        int a = Integer.MAX_VALUE;
        for (int anArray : array) {
            if (anArray < a) a = anArray;
        }
        return a;
    }
    private static int getMaximumFromArray(int[] array){
        int a = Integer.MIN_VALUE;
        for (int anArray : array) {
            if (anArray > a) a = anArray;
        }
        return a;
    }
    private static int[] sort(int[] array) {
        int step = array.length;
        boolean swapped = true;
        while (step > 1 || swapped) {
            if (step > 1)
                step = (int) (step / 1.25);
            int i = 0;
            swapped = false;
            while (i + step < array.length) {
                if (array[i] > array[i+step]){
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    swapped = true;
                }
                i++;
            }
        }
        return array;
    }

    private static int countOfRepeat(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) temp++;
            }
            if (temp > count) count = temp;
        }
        return count;
    }

    private static int countMinOfRepeat(int[] array){
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) temp++;
            }
            if (temp < count & temp > 1) count = temp;
        }
        return count;
    }
    
}
