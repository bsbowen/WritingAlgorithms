package org.example;


public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            //pi is the partitioning index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //choosing the last element as pivot
        int i = (low -1);//index of smaller than or equal to pivot

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // increment index of smaller element
                 //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            // swap arr[i+1] and the pivot (arr[high])
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return (i + 1);

    }

}
