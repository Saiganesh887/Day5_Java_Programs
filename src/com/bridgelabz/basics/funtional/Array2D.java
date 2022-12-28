package com.bridgelabz.basics.funtional;

import java.io.DataInput;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Deep to string method: ");
        System.out.println(Arrays.deepToString(arr));
    }
}
