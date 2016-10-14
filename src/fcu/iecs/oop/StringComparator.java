package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args){
		String a,b;
		do{
			Scanner out= new Scanner(System.in);
		
			System.out.print("Enter a string 1:");
			a=out.next();
			System.out.print("Enter a string 2:");
			b=out.next();
		}while(!a.equalsIgnoreCase(b));

		
		
			System.out.println("The two strings are the same.");
		
		
		
	}

}
