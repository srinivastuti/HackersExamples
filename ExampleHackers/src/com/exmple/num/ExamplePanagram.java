package com.exmple.num;

public class ExamplePanagram {

	public static void main(String[] args) {
		String str = "The quick brown fox ju0ps over the lazy dog";
		System.out.println(findMissingLetters(str));
	}

	public static String findMissingLetters(String mySentence) {
		String result = "";
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };

		String missingLetters = "";
		int countMissLetters = 0;

		for (int i = 0; i < alphabet.length; i++) {
			if (!mySentence.toLowerCase().contains(
					String.valueOf(alphabet[i]).toLowerCase())) {
				missingLetters = missingLetters + String.valueOf(alphabet[i])
						+ " ";
				countMissLetters++;
			}
		}
		if (countMissLetters == 0)
			System.out.println("Sting as  Panagram ");
		else
			System.out.println("Sting as  Not Panagram ");
		result = "Letters who are missing: " + missingLetters + "Counted: "
				+ countMissLetters;
		return result;
	}

}
