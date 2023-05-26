package com.martapanc.ilovealgorithms;

public class PalindromicString {

    public static boolean isPalindrome(String inputString) {
        if (inputString.isEmpty()) {
            return false;
        }
        int firstIndex = 0;
        int lastIndex = inputString.length() - 1;

        boolean isPalindrome = true;
        while (firstIndex < lastIndex) {
            if (inputString.charAt(firstIndex) != inputString.charAt(lastIndex)) {
                isPalindrome = false;
                break;
            }

            firstIndex++;
            lastIndex--;
        }
        return isPalindrome;
    }

}
