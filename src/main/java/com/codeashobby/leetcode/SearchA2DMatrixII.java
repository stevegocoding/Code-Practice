/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int w = matrix[0].length;

        for (int[] arr : matrix) {
            if (arr[0] <= target && arr[w - 1] >= target && (Arrays.binarySearch(arr, target) >= 0)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        int[][] matrix = new int[][]{{1, 4}, {2, 5}};
        searchMatrix(matrix, 4);
    }
}