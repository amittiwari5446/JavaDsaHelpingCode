package org.example.Arrays;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[][] dp= {{5,3,1},{2,6,0},{2,7,4},{9,8,7},{3,7,5}};
		
		//sorting, based on 1st element in arrays in ascending order
		Arrays.sort(dp, (a,b)-> Integer.compare(a[0], b[0]));
		for(int[] x:dp) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		//sorting, according to 2nd element in descending order
		Arrays.sort(dp, (a,b)-> Integer.compare(b[1], a[1]));
		for(int[] x:dp) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		//sorting, in ascending order of 1st element and in descending order of 2nd element 
		Arrays.sort(dp, (a,b)->{
			if(a[0]!=b[0]) return a[0]-b[0];
			else return b[1]-a[1];
		});
		for(int[] x:dp) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
