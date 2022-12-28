package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        String ch = sc.nextLine();

        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
