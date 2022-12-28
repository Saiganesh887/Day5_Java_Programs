package com.bridgelabz.basics;

import java.util.Scanner;

public class TossPercent {
    static double toss(){
        double toss1 = Math.random();
        return toss1;
    }
    static float percent(float heads_tails, int flips){
        float percent1 = (heads_tails/flips) * 100;
        return percent1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Times to Flip Coin: ");
        int n = sc.nextInt();
        int heads = 0,tails = 0;
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                double toss = toss();
                if (toss < 0.5) {
                    tails++;
                } else {
                    heads++;
                }
            }
        }
        System.out.println("number of flips: "+n);
        System.out.println("Result Head: "+heads+ " times");
        System.out.println("Result tails: "+tails+" times");
        float heads_percent = percent(heads,n);
        float tails_percent = percent(tails,n);
        System.out.println("Heads Percentage: "+heads_percent+"%");
        System.out.println("Tails Percentage: "+tails_percent+"%");
    }
}
