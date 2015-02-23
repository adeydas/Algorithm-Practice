package com.abhishek;

/**
 * http://jira.abhis.ws/browse/AP-42
 */
public class AP_42 {

    //O(n2) implementation
    public String findLargestPalindrome(String string) {
        if (string.length() > 2) {
            char[] carr = string.toCharArray();

            int maxPalindromeLength = Integer.MIN_VALUE;
            int globalBegin = 0;
            int globalEnd = 0;

            for (int i=3; i<carr.length; i++) {
                int mid = i;
                int begin = i-1;
                int end = i+1;
                while (begin >= 0 && end <= carr.length-1) {
                    if (carr[begin] != carr[end])
                        break;
                    begin--;
                    end++;
                }
                int palindromeLength = (end-begin)+1;
                if (palindromeLength > maxPalindromeLength) {
                    maxPalindromeLength = palindromeLength;
                    globalBegin = begin+1;
                    globalEnd = end-1;
                }
            }

            String result = "";

            for (int i=globalBegin; i<=globalEnd; i++) {
                result += Character.toString(carr[i]);
            }

            return result;
        } else {
            return string;
        }
    }

    public static void main(String... args) {
        String str = "RACECAR";

        AP_42 ap_42 = new AP_42();
        System.out.println(ap_42.findLargestPalindrome(str));
    }

}
