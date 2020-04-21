package com.exmple.num;

import java.util.Scanner;

public class PascalTriangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the int Value");
		int n = input.nextInt();
		printPascal(n);
	}

	private static void printPascal(int n) 
	{ 
	    
	    for (int line = 0; line < n; line++) 
	    { 
	       for (int i = 0; i <= line; i++) 
	            System.out.print(" "+binomialCoeff(line, i)); 
	            System.out.println(""); 
	    } 
	    
	}

	private static Object binomialCoeff(int n, int k) {
		// TODO Auto-generated method stub
		int res = 1; 
	    if (k > n - k) 
	    k = n - k; 
	    for (int i = 0; i < k; ++i) 
	    { 
	        res *= (n - i); 
	        res /= (i + 1); 
	    } 
	      
	    return res; 
	} 
}
