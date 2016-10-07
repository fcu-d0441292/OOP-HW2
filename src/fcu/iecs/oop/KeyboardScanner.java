package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args){
		Scanner out= new Scanner(System.in);
		
		System.out.print("Enter a integer: ");
		int a=out.nextInt();
		System.out.print("Enter a float point number:");
		double b=out.nextDouble();
		System.out.print("Enter a you name: ");
		String c=out.next();
		double d=a*b;
		System.out.printf("Hi %s , the multiplication of %b and %7.5f is %8.2e",c,a,b,d);
		
	}

}
