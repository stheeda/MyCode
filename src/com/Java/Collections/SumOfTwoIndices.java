package com.Java.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIndices {

	public int[] twoSum(int[] nums) {
		int a[] = new int[nums.length];
		int k = 0;
		int maxIdx[] = new int[2];
		int currMaxSum = -1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1 + i; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum > currMaxSum) {
					maxIdx[0] = nums[i];
					maxIdx[1] = nums[j];
					currMaxSum = sum;
				}
				System.out.println("sum: " + sum);
				System.out.println("currMaxSum:" + currMaxSum);

			}

		}
		return maxIdx;
	}

	public static void main(String[] args) {
		SumOfTwoIndices la = new SumOfTwoIndices();
		System.out.println(Arrays.toString(la.twoSum(new int[] { 1, 2, 3, 9, 4 })));

	}
}