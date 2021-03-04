package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {7, 5, 1, 2, 3, 7, 4, 5, 5, 6, 6, 6, 7, 7};
       System.out.println( findCountMax(array));

    }

    static private int findCountMax(int[] array) {
        int max = 0;
        int count = 0;
        for (int i : array
        ) {
            if (i > max) {
                max = i;
                count = 1;

            } else if (i == max) {
                count++;
            }


        }
       return count;
    }
}
