package com.company;

public class Main {

    public static void main(String[] args) {
        BreakingSymmetry string1 = new BreakingSymmetry("qwe");
        String string2 = "qwe";
        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string1));
    }
}
