package com.example.java_test;

public class vowel {
    public static int vowels(String str) {
        int vowelcount = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelcount++;
            }
        }
        return vowelcount;
    }

    public static void main(String[] args) {
        System.out.println(vowels("my name is khan"));
    }
}
