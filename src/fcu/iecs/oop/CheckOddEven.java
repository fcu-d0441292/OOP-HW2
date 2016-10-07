package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args){
		Scanner out=new Scanner(System.in);
		
		System.out.print("Enter a integer:");
		int a=out.nextInt();
		if(a==0){
			System.out.print("0 isn't belong to Even Number orOdd Number.");
		}
		else if(a%2==0){
			System.out.print("The input integer is Even Number.");
		}
		else{
			System.out.print("The input integer is Odd Number.");
		}
	}

}
