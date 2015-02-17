package com.abhishek;

/**
 * Red Black trees
 */
public class AP_27 {
    public class RBNode {
        public int value;
        public boolean isRed;
        public RBNode left;
        public RBNode right;

        public RBNode(int value) {
            this.value = value;
            this.isRed = true;
            this.left = null;
            this.right = null;
        }

        public RBNode(){}
    }

    public RBNode createNewRedNode(int value) {
        return new RBNode(value);
    }
}
