package com.divashchenko;

import java.util.Arrays;

public class MainTask2 {

    public static void main(String[] args) {
        int[] arr = {-7, -2, 0, 1, 2, 8, 20};

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(sortAndSquare(arr)));

    }

    private static int[] sortAndSquare (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }

        return bubbleSort(arr);
    }

    private static int[] bubbleSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}