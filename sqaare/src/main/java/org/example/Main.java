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

//              Pyramid

//        int rows = 5, k = 0;
//
//        for (int i = 1; i <= rows; ++i, k = 0) {
//            for (int space = 1; space <= rows - i; ++space) {
//                System.out.print("  ");
//            }
//
//            while (k != 2 * i - 1) {
//                System.out.print("* ");
//                ++k;
//            }
//
//            System.out.println();
//        }


//        Right Angle (Right )
//
//        int rows = 5;
//
//        for (int i = rows; i >= 1; --i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


// Error  or pyramid AB C D E F GH
//        int rows = 5;
//        int asciiValue = 65;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = rows - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) asciiValue + " ");
//                asciiValue++;
//            }
//            System.out.println();
//        }


//        right Angle (Left )
//
        int rows = 5;
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}