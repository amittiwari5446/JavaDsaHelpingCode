package org.example.InputOutput;

import java.util.Scanner;

public class InOut2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		int s=sc.nextInt();
		
		int[] dp=new int[s];
		for(int i=0;i<s;i++) {
			dp[i]=sc.nextInt();
		}
		
		System.out.println("You have entered: ");
		for(int x: dp) System.out.print(x);
		
		sc.close();
	}
}
