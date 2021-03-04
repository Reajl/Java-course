package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "ILoveJavaProgramming";
        printSubstrings(string);


        String string2 = new String("ILoveJavaProgramming");
        printSubstrings(string2);
    }

    static public void printSubstrings(String string) {
        System.out.print(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {


            if (string.charAt(i) > 'A' && string.charAt(i) < 'Z') {
                System.out.print("\n" + string.charAt(i));
            } else System.out.print(string.charAt(i));
        }
        System.out.println();
        System.out.println();

    }
}
