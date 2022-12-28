package com.bridgelabz.basics;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int swap;
        swap = n1;
        n1 = n2;
        n2 = swap;
        System.out.println("after swap n1: "+n1+" after swap n2: "+n2);

        n3=n3+n4;
        n4=n3-n4;
        n3=n3-n4;
        System.out.println("after swap n1: "+n3+" after swap n2: "+n4);
    }
}
