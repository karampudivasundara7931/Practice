package prac;

import java.util.Scanner;

public class pc1 {
	
	
	//Swap two numbers without using 3rd variable ; a=3,b=7,a=10,b=10-7=3->b=3,

	static void swap(int a,int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap" + a + " " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* read the input from standard user
		int num;
		System.out.println("Enter the integer:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("The given input integer is" + num);*/
		
		/*Java Program to Multiply Two Floating-Point Numbers
		float a = 0.25f;
		float b = 0.53f;
		float c = a * b;
		System.out.println("multiply is " + c); */
		
		/*Swap two numbers
		int a = 5;
		int b = 7;
		System.out.println("Before Swapping " + a + b); 
		int temp;
		temp = a;
		a=b;
		b= temp;
		
		System.out.println("After Swapping " + a + b);	*/
		//Swap two numbers without using 3rd variable
		int a= 8 ;
		int b=6;
		
		swap(a,b); 
		
		
		
		
		
		 
		
		
	}

}
