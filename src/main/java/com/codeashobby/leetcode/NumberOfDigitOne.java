/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.leetcode;

/**
 * Description: Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than
 * or equal to n.
 * <pre>
 * For example:
 * Given n = 13,
 * Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.
 * </pre>
 *
 * @author hzhou
 */
public class NumberOfDigitOne {

    public int countDigitOne(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10) {
            long a = n / m, b = n % m;
            ones += (a + 8) / 10 * m;

            if (a % 10 == 1) {
                ones += b + 1;
            }
        }
        return ones;
    }
}