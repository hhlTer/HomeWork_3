package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Enter count of digits");
//        int count = getIntChecking();
//        System.out.printf("Enter %d digits\n", count);
//        int[] arrayInt = new int[count];
//        for (int i = 0; i < count; i++) {
//            arrayInt[i] = getIntChecking();
//        }
        int[] arrayInt = {5, 6, -4, 1, 11, -9, 0};
        System.out.printf("Minimum digit: %d\n", getMinimumFromArray(arrayInt));
        System.out.printf("Maximum digit: %d\n", getMaximumFromArray(arrayInt));
        System.out.printf("Count of repeats number 5: %d\n", countOfNumber(arrayInt, 5));
        for (int a:
             sort(arrayInt)) {
            System.out.print((a) + " ");
        }


    }
    private static int countOfNumber(int[] array, int d){
        int count = 0;
        for (int anArray : array) {
            if (anArray == d) count++;
        }
        return count;
    }

    private static int getIntChecking(){
        System.out.println(":>");
        int a;
        Scanner scanner = new Scanner(System.in);
        try {
            a = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Wrong format");
            a = getIntChecking();
        }
        return a;
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
    
}
