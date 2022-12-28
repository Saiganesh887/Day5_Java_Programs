package com.bridgelabz.basics;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int year = 0;
        if (N <= 30) {
            for (int i = 0; i <= N; i++) {
                year = (int) Math.pow(2, i);
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            }
            }else
            System.out.println("Please check arguments");
        }
    }
