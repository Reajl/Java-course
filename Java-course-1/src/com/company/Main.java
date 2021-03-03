package com.company;

public class Main {

    public static void main(String[] args) {
        stairCase(10);
    }

    static private void stairCase(int n) {
        for (int i = 0; i < n; i++) {
            int spaceAmount = n - 1 - i;
            int stairCase = i + 1;
            if (spaceAmount > 0) {
                print(" ", spaceAmount);
            }
            print("#", stairCase);
            System.out.println();
        }

    }

    static private void print(String s, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(s);
        }
    }
}

