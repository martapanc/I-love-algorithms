package com.martapanc.ilovealgorithms;

public class LongestPalindromicSubstring {

    public static String compute(String input) {
        int length = input.length();

        int subStringLength = length;
        boolean palindromeIsFound = false;
        String subString = input;

        while (!palindromeIsFound) {
            int iterations = length - subStringLength + 1;
            for (int i = 0; i < iterations; i++) {
                subString = input.substring(i, subStringLength + i);
                if (isAPalindrome(subString)) {
                    palindromeIsFound = true;
                    break;
                }
            }
            subStringLength--;
        }

        return subString;
    }

    public static boolean isAPalindrome(String input) {
        if (input.length() <= 1) {
            return true;
        }

        int start = 0;
        int end = input.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }
}
