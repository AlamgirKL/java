package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enater Your Number : ");

        int num = input.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is odd");
    }
}