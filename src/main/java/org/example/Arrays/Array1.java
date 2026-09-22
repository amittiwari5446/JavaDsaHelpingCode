package org.example.Arrays;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		
		int[][] dp=new int[3][10];
		for(int[] row:dp) Arrays.fill(row, -1);
		for(int[] row:dp) System.out.println(Arrays.toString(row));
		System.out.println(".............................");
		
		int[] dp2=new int[4];
		Arrays.fill(dp2, -2);
		System.out.println(Arrays.toString(dp2));
		System.out.println(".............................");
		
		int[][] dp3=new int[3][10];
		for(int[] row:dp3) Arrays.fill(row, -1);
		String str = Arrays.deepToString(dp3);
		System.out.println(str);
		System.out.println(".............................");
		
		
	}
}
