package com.martapanc.ilovealgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicStringTest {

    @Test
    void testIsPalindrome() {
        assertFalse(PalindromicString.isPalindrome(""));
        assertFalse(PalindromicString.isPalindrome("ab"));

        assertTrue(PalindromicString.isPalindrome("a"));
        assertTrue(PalindromicString.isPalindrome("aba"));
        assertTrue(PalindromicString.isPalindrome("abba"));
        assertTrue(PalindromicString.isPalindrome("abcdefghijklkjihgfedcba"));
    }
}
