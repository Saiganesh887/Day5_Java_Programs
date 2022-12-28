package com.bridgelabz.basics.funtional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three input values: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double delta = Math.pow(b,2) - (4 * a * c);
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Two roots of Equation are: "+root1 + ","+root2);
    }
}
