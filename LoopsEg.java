package loops;

import java.util.Scanner;

public class LoopsEg {

	public static void main(String[] args) {
		//// write a code to add n natural mumbers 
		int sum=0;
		System.out.println("-----------------------------------------------------");
		System.out.println("------------Program to find sum of n natural number--");
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter the value of n");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum+i;
			System.out.println("Value of i ="+i);
			System.out.println("Value of sum ="+sum);
			
		}
		System.out.println("addition of "+n+" natural numbers are "+sum);
		

	}

}
