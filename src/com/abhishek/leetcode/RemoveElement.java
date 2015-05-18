package com.abhishek.leetcode;

import junit.framework.TestCase;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement extends TestCase {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1 && nums[0] == val)
            return 0;
        if (nums.length == 1 && nums[0] != val)
            return 1;
        int j=nums.length-1;
        int length = nums.length;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val && i<= j) {
                if (nums[i] == nums[j] && i!=j)
                    length = length-2;
                else
                    length = length-1;
                swap(nums, i, j--);
            }
        }

        return length;
    }

    private void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }

    public void testOne() {
        assertTrue(removeElement(new int[] {4,5}, 4) == 1);
    }
    public void testTwo() {
        assertTrue(removeElement(new int[] {3,3}, 3) == 0);
    }
    public void testThree() {
        assertTrue(removeElement(new int[] {1}, 1) == 0);
    }
    public void testFour() {
        assertTrue(removeElement(new int[] {4,5}, 5) == 1);
    }
}
