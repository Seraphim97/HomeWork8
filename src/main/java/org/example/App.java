package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello World!");

        //ex.3
        final int SEVEN = 7;
        int i = SEVEN;
        while (i <= 98) {
            System.out.println(i);
            i = i + SEVEN;
        }

        //ex.4
        int[] myArrayOne = new int[20];
        int sum = 0;
        Random rd = new Random();
        for (int a = 0; a < myArrayOne.length; a++) {
            myArrayOne[a] = rd.nextInt();
            sum = sum + myArrayOne[a];
        }
        int average = sum / myArrayOne.length;
        System.out.println("Average of myArrayOne = " + average);



    //ex.5
        int[] myArrayTwo = new int[10];
        for (int b = 0; b < myArrayTwo.length; b++) {
            myArrayTwo[b] = rd.nextInt();
        }
        Scanner in = new Scanner(System.in);
        double result = 0;
        int max = myArrayTwo[0];
        for (int b = 0; b < myArrayTwo.length; b++){
            result = myArrayTwo[b] + result;
        }
        System.out.println(Arrays.stream(myArrayTwo).max());
        System.out.println(Arrays.stream(myArrayTwo).min());






    }







}
