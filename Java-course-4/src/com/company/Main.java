package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "abceee";
        String s2 = "vvvbbb";

        System.out.println( s1.substring(0,s1.length()/2)+s2+s1.substring(s1.length()/2,s1.length()));
    }


}
