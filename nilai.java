package com.IPA1;

public class nilai {
    public static void main(String[] args) {
        int nilai = 100; 
        boolean isValid = (nilai >= 1 && nilai <= 3) || (nilai >= 88 && nilai <= 101 && nilai >= 99 && nilai <= 101);
        System.out.println(isValid);
    }
}