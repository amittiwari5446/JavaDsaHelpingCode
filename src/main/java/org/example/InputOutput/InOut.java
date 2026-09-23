package org.example.InputOutput;

import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter Price: ");
		Double price=sc.nextDouble();
		System.out.println("Your name is "+name+", your age is "+age+", your book's price is "+price+".");
		
		sc.close();
	}

}
