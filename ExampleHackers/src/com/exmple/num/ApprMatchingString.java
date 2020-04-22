package com.exmple.num;

import java.util.HashSet;
import java.util.Scanner;

public class ApprMatchingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner prefixStr = new Scanner(System.in);
		System.out.println("Enter prefix String ");
		String prefixText = prefixStr.nextLine();
		Scanner suffixStr = new Scanner(System.in);
		System.out.println("Enter suffix String ");
		String suffText = suffixStr.nextLine();
		Scanner textScore = new Scanner(System.in);
		System.out.println("Enter textScore String ");
		String textMain = textScore.nextLine();
		FindCompareString(prefixText, suffText, textMain);
	}

	private static void FindCompareString(String prefixText, String suffText,
			String textMain) {
		// TODO Auto-generated method stub
		int preCount = 0, SufCount = 0;
		char[] prefixArray = prefixText.toCharArray();
		char[] suffixArray = suffText.toCharArray();
		char[] masterArray = textMain.toCharArray();
		HashSet<Character> preSet = new HashSet<>();
		HashSet<Character> sufSet = new HashSet<>();
		for (int i = 0; i < prefixArray.length; i++) {
			for (int j = 0; j < masterArray.length - 1; j++) {
				if (prefixArray[i] == masterArray[j]
						&& (!preSet.contains(prefixArray[i]))) {
					preSet.add(prefixArray[i]);
					preCount++;
				}
			}
		}
		for (int i = 0; i < suffixArray.length; i++) {
			for (int j = 0; j < masterArray.length - 1; j++) {
				if (suffixArray[i] == masterArray[j]
						&& (!sufSet.contains(suffixArray[i]))) {
					sufSet.add(suffixArray[i]);
					SufCount++;
				}
			}
		}
		System.out.println(textMain.substring(0, preCount + SufCount));
	}

}
