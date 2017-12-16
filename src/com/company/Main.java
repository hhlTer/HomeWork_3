package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count of digit");
        int count = getIntChecking();
        System.out.println("Enter digits");
        int[] arrayInt = new int[count];
        for (int i = 0; i < count; i++) {

        }
    }
    static int getIntChecking(){
        System.out.println(":>");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong format");
            a = getIntChecking();
        }
        return a;
    }
}
