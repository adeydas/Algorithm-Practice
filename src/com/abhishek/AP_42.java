package com.abhishek;

/**
 * http://jira.abhis.ws/browse/AP-42
 */
public class AP_42 {

    public String findLargestPalindrome(String string) {

        if (string == null)
            return null;

        if (string.length() == 1)
            return string;

        char[] cArr = string.toCharArray();

        int start = 0; //start from the 0th index
        int end = cArr.length-1; //end at l-1

        String result = "";
        int begin = -1;
        int finish = -1;

        while (start < end) {
            char atStart = cArr[start];
            char atEnd = cArr[end];

            if (atStart == atEnd) {
                if (begin == -1 && finish == -1) {
                    begin = start;
                    finish = end;
                }
            } else {
                begin = -1;
                finish = -1;
            }
            start = start+1;
            end = end-1;
        }

        if (begin == -1 && finish == -1)
            return null;

        for (int i=begin; i<=finish; i++) {
            result += Character.toString(cArr[i]);
        }

        return result;
    }

    public static void main(String... args) {
        String str = "DABCBAK";

        AP_42 ap_42 = new AP_42();
        System.out.println(ap_42.findLargestPalindrome(str));
    }

}
