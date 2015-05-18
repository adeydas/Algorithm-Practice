package com.abhishek.leetcode;

import com.abhishek.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.next == null && head.val == val)
            return null;
        if (head.next == null && head.val != val)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (fast.val == val) {
                if (fast.next == null) {
                    slow.next = null;
                } else {
                    slow.next = fast.next;
                }
            }
            if (slow.next != null)
                slow = slow.next;

            if (slow.next != null)
                fast = slow.next;
            else
                fast = null;
        }

        return head;
    }
}
