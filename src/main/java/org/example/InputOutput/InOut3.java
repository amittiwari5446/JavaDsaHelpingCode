package org.example.InputOutput;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InOut3 {
	public static void main(String[] args) {
		try {
			File file=new File("D:/Amit for Practice/java/JavaDsaHelpingCode/data.txt");
			Scanner sc=new Scanner(file);
			
			while(sc.hasNextLine()) {
				String val = sc.nextLine();
				System.out.println(val);
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			File file2 = new File("D:/Amit for Practice/java/JavaDsaHelpingCode/data2.txt");
			Scanner sc2=new Scanner(file2);
			
			List<Integer> list=new ArrayList<>();
			while(sc2.hasNextLine()) {
				list.add(sc2.nextInt());
			}
			System.out.println(list);
			sc2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			File file=new File("D:/Amit for Practice/java/JavaDsaHelpingCode/data3.txt");
			Scanner sc = new Scanner(file);
			List<int[]> list=new ArrayList<int[]>();
			while(sc.hasNextInt()) {
				int size=sc.nextInt();
				int[] dp=new int[size];
				for(int i=0;i<size;i++) {
					if(sc.hasNextInt()) dp[i]=sc.nextInt();
					else break;
				}
				list.add(dp);
			}
			for(int[] x:list) {
				for(int p:x) {
					System.out.print(p+" ");
				}
				System.out.println();
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
