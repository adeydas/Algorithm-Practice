package com.abhishek;

import java.util.LinkedList;

/**
 * Pre-Order Traversal (Root - Left - Right)
 */
public class AP_11 {

    public void preOrderRecurse(Node head) {
        if (head == null) return;

        System.out.println(head.value);
        preOrderRecurse(head.left);
        preOrderRecurse(head.right);
    }

    public void preOrderIterative(Node head) {
        LinkedList<Node> stack = new LinkedList<Node>();

        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                System.out.println(head.value);
                if (head.right != null) {
                    stack.push(head.right);

                }
                //Put right sub-trees in stack and iterate through left
                head = head.left;
            } else {
                head = stack.pop();
            }
        }
    }

    public static void main(String... args) {
        Node node1 = new Node();
        node1.value = (Object)1;
        node1.left = null;
        node1.right = null;

        Node node2 = new Node();
        node2.value = (Object)2;
        node2.left = null;
        node2.right = null;

        Node root = new Node();
        root.value = (Object)3;
        root.left = node1;
        root.right = node2;

        new AP_11().preOrderRecurse(root);
        new AP_11().preOrderIterative(root);
    }

}
