package prac;

import java.util.Scanner;

public class pc3 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*prime number from 1 to N
		int i;
		int j;
		int n= 11;
		for(i =1;i<=n;i++) {
			int count =0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}*/
		
		/* find leap year -A leap year need this facts to satisfy
		A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
		A leap year (except a century year) can be identified if it is exactly divisible by 4.
		A century year should be divisible by 4 and 100 both.
		A non-century year should be divisible only by 4.
		int year = 2024;
		if((year%400==0) || (year%4==0) && (year%100 !=0)) {
			System.out.println("given year is leap year");
		}else {
			System.out.println("given year is not leap year");
		}*/
		
		/*find armstrong number is for ex:153 total digits are 3 which are 1,5,3 so we need to multiply each digit 3 times so 1^3+5^3+3^3 =153 so it is amstrong
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		 int backup = num;
		 int sum=0;
		 while(num>0) {
			 sum = sum + (num%10)*(num%10)*(num%10);
			 num = num/10;
		 }
		if(sum==backup) {
			System.out.println("given num is amstrong");
		}else {
			System.out.println("given num is not amstrong");
		}*/
		
		/*Java Program to Check If a Number is Neon Number or Not ex: 9 -> 9*9(need to sqaure for sure)=81 then need to add 8+1 =9 which equals to given num so it is neon number
		int n=9;
		int square = n*n;
		int sum=0;
		while(square>0)
        {
        int r=square%10;
        sum+=r;
        square=square/10;
        }
		
		if(sum==n) {
			System.out.println("given num is neon ");
		}else {
			System.out.println("given num is not neon");
		}*/
		
		//char is vowel or consonant
		
		char ch = 'r';
		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')) {
			System.out.println("given charcter is vowel ");
		}else {
			System.out.println("given num is consonant");
		}
	}

}
