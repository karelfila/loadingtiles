package com.company;

public class Main {

    public static void main(String[] args) {
        // /, |, \, -

        int a = 0;
        int b = 0;
        while (b < 100) {

            while (a <= 3) {
                System.out.println("|");
                a++;
            }
            while (a <= 6) {
                System.out.println("/");
                a++;
            }
            while (a <= 9) {
                System.out.println("-");
                a++;
            }
            while (a <= 12) {
                System.out.println("\\");
                a++;
            }
            a = 0;
            b = b + 12;
        }
    }
}
