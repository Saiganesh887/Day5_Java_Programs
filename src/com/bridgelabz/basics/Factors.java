package com.bridgelabz.basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int i,facts;
        System.out.println("Prime Factors are: ");
        for(i=2;i*i<n;i++){
            if(n%i == 0){
                facts = i;
                System.out.println(facts);
            }
        }
    }
}
