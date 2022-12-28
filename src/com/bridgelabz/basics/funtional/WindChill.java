package com.bridgelabz.basics.funtional;

public class WindChill {
    public static void main(String[] args) {
        double t = Integer.parseInt(args[0]);
        double v = Integer.parseInt(args[1]);
        if (t <= 50 && v <= 120 && v > 3) {
            double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(w);
        }else{
            System.out.println("Please check the arguments you have entered.");
        }
    }
}
