package com.bridgelabz.basics;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Enter divisor");
        int divisor = sc.nextInt();
        if (number > divisor) {
            double quotient = number / divisor;
            double reminder = number % divisor;
            System.out.println("Quotient: " + quotient);
            System.out.println("Reminder: " + reminder);
        }else
            System.out.println("Number should be greater than Divisor");
    }
}
