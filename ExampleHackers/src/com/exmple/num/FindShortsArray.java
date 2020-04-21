package com.exmple.num;

import java.util.Arrays;

public class FindShortsArray {

	// Array declaration
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 }, { 0, 2, 7 }, { 4, 12 }, { 1, 2, 5, 6 } };
		int smalestArray = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				smalestArray = arr[i].length;
			} else if (smalestArray > arr[i].length) {
				smalestArray = arr[i].length;
				index = i;
			}
		}

		System.out.println(smalestArray);
		System.out.println(Arrays.toString(arr[index]));
	}
}
