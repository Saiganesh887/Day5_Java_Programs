package com.bridgelabz.basics;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        double result = 0.0;
        while(n > 0)
        {
            result = result + (double) 1 / n;
            n--;
            System.out.print(result +"  ");
        }
        System.out.println('\n'+"Nth Harmonic value: "+result);
    }
}
