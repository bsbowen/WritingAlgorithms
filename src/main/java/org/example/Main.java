package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1: Testing Bubble Sort
        int[] bubbleArray = {4, 1, 3, 9, 7};
        System.out.println("Original Array for Bubble Sort:");
        System.out.println(Arrays.toString(bubbleArray));
        BubbleSort.bubbleSort(bubbleArray, bubbleArray.length);
        System.out.println("Sorted Array using Bubble Sort:");
        System.out.println(Arrays.toString(bubbleArray));

        // Example 2: Testing Quick Sort
        int[] quickArray = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        System.out.println("\nOriginal Array for Quick Sort:");
        System.out.println(Arrays.toString(quickArray));
        QuickSort.quickSort(quickArray, 0, quickArray.length - 1);
        System.out.println("Sorted Array using Quick Sort:");
        System.out.println(Arrays.toString(quickArray));
    }
}