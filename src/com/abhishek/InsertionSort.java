package com.abhishek;

/**
 * Insertion Sort.
 */
public class InsertionSort {
    private int[] numbers;

    public void sort(int[] values) {
        for (int i=0; i<values.length; i++) {
            int j=i;
            while (j>0 && values[j-1] > values[j]) {
                swap(values, j, j-1);
                j=j-1;
            }
        }
    }

    private void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static void main(String... args) {
        int[] arr = {10,1,0,100,15};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
