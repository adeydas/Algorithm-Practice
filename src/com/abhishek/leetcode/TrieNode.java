package com.abhishek.leetcode;

import com.abhishek.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek on 5/27/2015.
 */
class TrieNode {
    // Initialize your data structure here.
    public String val;
    public List<TrieNode> nodes = new ArrayList<>();

    public TrieNode() {

    }
    public TrieNode(String val) {
        this.val = val;
    }
}
