package com.abhishek;

/**
 * Merge Sort.
 */
public class MergeSort {
    private int[] numbers;
    private int[] helperArr;
    private int length;

    public void sort(int[] values) {
        this.numbers = values;
        this.length = values.length;
        this.helperArr = new int[this.length];
        mergesort(0, length-1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high-low) /2;
            mergesort(low, middle);
            mergesort(middle+1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        //Copy both parts (low - mid, mid+1 - high) in the helper array.
        for (int i=low; i<=high; i++) {
            helperArr[i] = numbers[i];
        }

        int i=low;
        int j=middle+1;
        int k=low;

        /**
         * Begin merge part.
         */
        //Copy the smallest values from either the left or the right side to the original array.
        while (i<=middle && j<=high) {
            if (helperArr[i] <= helperArr[j]) {
                numbers[k] = helperArr[j];
                i++;
                //A counter here would give the number of inversions.
            } else {
                numbers[k] = helperArr[j];
                j++;
            }
            k++;
        }

        //Copy the rest of the left side back into the array. Why not the right side? Because that has already been copied.
        while (i<=middle) {
            numbers[k] = helperArr[i];
            k++;
            i++;
        }
    }

    public static void main(String... args) {
        int[] arr = {10,1,0,100,15};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
