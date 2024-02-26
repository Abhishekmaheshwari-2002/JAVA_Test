package com.example.java_test;

public class factorial {
    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        int n ;
        System.out.println(fac(n));

    }
}
