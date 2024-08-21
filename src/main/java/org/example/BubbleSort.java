package org.example;

public class BubbleSort {
     public static void bubbleSort (int [] arr, int N) {
        //N is the size of the array
        for (int i = 0; i < N -1; i++) {
            for (int j = 0; j < N-i-j; j++) {
                if (arr[j] > arr[+1]) {
                    //swamp arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
