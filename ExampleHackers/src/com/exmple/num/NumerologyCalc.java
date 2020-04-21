package com.exmple.num;

import java.util.Scanner;

public class NumerologyCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		int numerlogyNum=getNumerlogyNum(scan);
		System.out.println("Numerology number for the given name as \t"+numerlogyNum);
	}

	private static int getNumerlogyNum(Scanner scan) {
		// TODO Auto-generated method stub
		int numer = 0, sum, n;
		char[] numCh = scan.nextLine().toUpperCase().toCharArray();
		for (char numChar : numCh) {
			if (numChar == 'A' || numChar == 'I' || numChar == 'J'
					|| numChar == 'Q' || numChar == 'Y') {
				numer += 1;
			} else if (numChar == 'B' || numChar == 'K' || numChar == 'R') {
				numer += 2;
			}

			else if (numChar == 'C' || numChar == 'G' || numChar == 'L'
					|| numChar == 'S') {
				numer += 3;
			}

			else if (numChar == 'D' || numChar == 'M' || numChar == 'T') {
				numer += 4;
			} else if (numChar == 'E' || numChar == 'H' || numChar == 'N'
					|| numChar == 'X') {
				numer += 5;
			} else if (numChar == 'U' || numChar == 'V' || numChar == 'W') {
				numer += 6;
			} else if (numChar == 'O' || numChar == 'Z') {
				numer += 7;
			} else if (numChar == 'F' || numChar == 'P') {
				numer += 8;
			} else {
				numer += 0;
			}
		}
		sum = numer;
		if (numer > 9) {
			sum = 0;
			while (numer > 0) {
				n = numer % 10;
				sum = sum + n;
				numer = numer / 10;
			}
		}
		return sum;
	}
}
