package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args){
		Scanner out= new Scanner(System.in);
		
		System.out.print("Enter a string 1:");
		String a=out.next();
		System.out.print("Enter a string 2:");
		String b=out.next();
		
		a = a.toUpperCase();
		b = b.toUpperCase();
		
		if(a.equals(b)){
			System.out.print("The two strings are the same.");
		}
		else{
			System.out.print("The two strings are not the same.");
		}
	}

}
