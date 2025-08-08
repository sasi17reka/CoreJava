package day3;

import java.util.Scanner;

public class Operators {
	int a;
	int b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=sc.nextInt();
		System.out.println("Enter number2");
		int b=sc.nextInt();
		System.out.println("Addition :"+(a+b));
		System.out.println("Subtraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("MOdulus :"+(a%b));
		
	}

}
