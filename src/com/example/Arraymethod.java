package com.example;

import java.util.Scanner;

public class Arraymethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enterd array Element is ");
            b[i] = sc.nextInt();
        }
        System.out.println("print array element is");
        for (int j : b) {

            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
