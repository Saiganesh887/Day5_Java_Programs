package com.bridgelabz.basics.funtional;

import java.util.Scanner;

public class DistinctTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        int count = 0;
        System.out.println("Enter Array Elements: ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                        count++;
                    }
                }
            }
        }
        System.out.println("Triplets found: "+count);
        if (found == false)
            System.out.println(" not exist ");
    }
}
