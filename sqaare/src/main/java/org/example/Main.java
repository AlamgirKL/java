package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row Size : ");
//
//        int rowSize =  sc.nextInt();
//        int a[][] = new int [rowSize][];
//
//        for (int i = 0; i <rowSize ; i++ ){
//            System.out.println("Enter col size : ");
//            int colSize = sc.nextInt();
//            a[i] = new int[colSize];
//
//            for ( int j = 0 ; j <colSize ; j++ ){
//                System.out.println("Enter data colSize");
//                a[i][j] =sc.nextInt();
//            }
//        }
//        for ( int x =0 ; x< a.length ; x++){
//            for ( int y = 0 ; y< a[x].length; y++){
//                System.out.println( a[x][y]);
//            }
//        }
//
//        int rows = 5;
//
//        for (int i = 0; i <= rows; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Right Angle (left)

        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }



    }
}