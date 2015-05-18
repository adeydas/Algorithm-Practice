package com.abhishek.leetcode;

import junit.framework.TestCase;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesSortedArr extends TestCase {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int length = nums.length;

        int slow = 0;
        int fast = 1;
        int loc = 0;

        while (fast < nums.length) {
            int t = 0;
            while (fast<nums.length && nums[slow] == nums[fast]) {
                t++;
                fast = fast+1;
            }
            length -= t;
            nums[loc] = nums[slow];
            loc = loc + 1;
            slow = fast;
            if (slow + 1 <= nums.length-1)
                fast = slow+1;
            else {
                if (fast < nums.length)
                    nums[loc] = nums[fast];
                break;
            }
        }

        return length;
    }

    public void testOne() {
        assertTrue(removeDuplicates(new int[]{1,1,2}) == 2);
    }
    public void testTwo() {
        assertTrue(removeDuplicates(new int[]{1,1}) == 1);
    }
    public void testThree() {
        assertTrue(removeDuplicates(new int[]{1,2,2}) == 2);
    }

}
