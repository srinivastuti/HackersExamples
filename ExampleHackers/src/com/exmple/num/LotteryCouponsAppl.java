package com.exmple.num;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LotteryCouponsAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input");
		int noOfLotteries = input.nextInt();
		Map<Integer, Integer> allSumMap = new HashMap<>();
		for (int lotorryNum = 1; lotorryNum <= noOfLotteries; lotorryNum++) {
			int lottorySum = getLotterySum(lotorryNum);
			if (allSumMap.containsKey(lottorySum)) {
				allSumMap.put(lottorySum,(new Integer(allSumMap.get(lottorySum)).intValue() + 1));
			} else {
				allSumMap.put(lottorySum, new Integer(1));
			}
		}
		System.out.println(allSumMap);
		int result = 0;
		int maxValueInMap = (Collections.max(allSumMap.values()));
		for (Entry<Integer, Integer> entry : allSumMap.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				result++;
				System.out.println(entry.getKey());
			}
		}
		System.out.println("Final Result \t" + result);
	}

	private static int getLotterySum(int lotteryNum) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (lotteryNum != 0) {
			sum = sum + lotteryNum % 10;
			System.out.println("check"+sum);
			lotteryNum = lotteryNum / 10;
			System.out.println(lotteryNum);
		}
		return sum;
	}

}
