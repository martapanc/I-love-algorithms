package com.martapanc.ilovealgorithms;

import org.junit.jupiter.api.Test;

import static com.martapanc.ilovealgorithms.LongestPalindromicSubstring.compute;
import static com.martapanc.ilovealgorithms.LongestPalindromicSubstring.isAPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LongestPalindromicSubstringTest {

    @Test
    void testLongestPalindrome() {
        assertEquals("", compute(""));
        assertEquals("a", compute("a"));
        assertEquals("1", compute("1"));
        assertEquals("a", compute("ab"));
        assertEquals("aba", compute("aba"));
        assertEquals("abcba", compute("abcba"));
        assertEquals("abcba", compute("abcbaa"));
        assertEquals("abcba", compute("aabcba"));
        assertEquals("bb", compute("cbbd"));
        assertEquals("bb", compute("cbb"));
        assertEquals("bb", compute("cbbaa"));
        assertEquals("UkXXkU", compute("LLf5OdXviDddj1dUkXXkUony9I3QnL3ESFxui2u74B12H6xK1p"));
        assertEquals("ESSE", compute("nqqxdC8FUjfpnOO82RrR45UjLC1tmOYgE8VyX9GQtTgS0emJ8fdpKyESSExfzfXf6o1X3pvEazCWNZ0ckblTrg6yHI3rAidSPjR8"));
    }

    @Test
    void testIsAPalindrome() {
        assertFalse(isAPalindrome("ab"));
        assertFalse(isAPalindrome("abc"));
        assertFalse(isAPalindrome("abb"));
        assertFalse(isAPalindrome("abbo"));

        assertTrue(isAPalindrome("a"));
        assertTrue(isAPalindrome("aa"));
        assertTrue(isAPalindrome("aba"));
        assertTrue(isAPalindrome("abba"));
        assertTrue(isAPalindrome("abcba"));
        assertTrue(isAPalindrome("girafarig"));
        assertTrue(isAPalindrome("ediolognomomongoloide"));
        assertTrue(isAPalindrome("itopinonavevanonipoti"));
        assertTrue(isAPalindrome("murderforajarofredrum"));
    }
}
