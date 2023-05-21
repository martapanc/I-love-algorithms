package com.martapanc.datastructures;

import java.util.*;

public class Fibonacci {

    private static final Map<Integer, Long> memo = new HashMap<>();

    public static long recFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recFibonacci(n - 1) + recFibonacci(n - 2);
    }

    public static long dpFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = dpFibonacci(n - 1) + dpFibonacci(n - 2);

        memo.put(n, fib);

        return fib;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println("Fibonacci number at position " + n);

        long startTime = System.nanoTime();
        System.out.println("*  with Recursion: " + recFibonacci(n));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        System.out.println("*  with Memoization: " + dpFibonacci(n));
        endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1_000_000 + " ms");

    }
}
