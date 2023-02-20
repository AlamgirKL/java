package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();

        if (90 <= num ){
            System.out.println("A+");
        }else if (80 <= num) {
            System.out.println("A");

        } else if (70 <= num) {
            System.out.println("B");

        } else if (60 <= num) {
            System.out.println("C");

        } else System.out.println("Failed ");
    }
}