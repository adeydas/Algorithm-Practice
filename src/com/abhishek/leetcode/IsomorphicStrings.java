package com.abhishek.leetcode;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.
 */
public class IsomorphicStrings extends TestCase {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0)
            return true;

        Map<Character, Character> mp = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mp.containsKey(c1) && mp.get(c1) != c2)
                return false;
            if (!mp.containsKey(c1) && mp.containsValue(c2))
                return false;

            mp.put(c1, c2);
        }

        return true;
    }



    public void testOne() {
        assertTrue(isIsomorphic("egg", "add"));
    }
    public void testTwo() {
        assertTrue(!isIsomorphic("foo", "bar"));
    }
    public void testThree() {
        assertTrue(isIsomorphic("paper", "title"));
    }
}
