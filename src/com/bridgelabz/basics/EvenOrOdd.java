package com.bridgelabz.basics;

import java.util.Scanner;

public class EvenOrOdd {
        public static int OddEven(int num) {
            if(num == 0)
                System.out.println("Zero");
            else if(num%2 == 0)
                System.out.println(num + " is a even number");
            else
                System.out.println(num + " is a odd number");
            return num;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        OddEven(n);
    }
}
