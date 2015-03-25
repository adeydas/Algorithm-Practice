package com.abhishek;

/**
 * Quick sort implementation.
 */
public class QuickSort {
    private int[] numbers;
    private int length;

    public void sort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        this.length = values.length;
        sort(0, length-1);
    }

    private void sort(int low, int high) {
        int i=low, j=high;

        int pivot = numbers[low + (high-low)/2]; //find the pivot, preferably the mid point

        while (i<=j) {
            //keep all numbers smaller than the pivot on the left side.
            while (numbers[i] < pivot) {
                i++;
            }

            //keep all numbers greater than the pivot on the right side.
            while (numbers[j] > pivot) {
                j--;
            }

            //if a greater number is found on the left side, swap.
            if (i <= j) {
                swap (i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(low, j);
        }
        if (i<high) {
            sort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = this.numbers[i];
        this.numbers[i] = this.numbers[j];
        this.numbers[j] = temp;
    }

    public static void main(String... args) {
        int[] arr = {10,1,0,100,15};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
