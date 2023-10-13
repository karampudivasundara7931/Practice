package prac;

import java.util.Scanner;

public class excelrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch='A';
		int k = 0;
		char c='A';
		int count = 0;
		//if(n<=26) {
			for(k=1;k<=26;k++) {
				
			System.out.print(ch + " ");
			ch++;
			count++;
			} 
			//}else 
			if(n>26) {
		for(int i=1;i<=26;i++) {
			
			char ch1='A';
			for(int j=1;j<=26;j++) {
				
				System.out.print((char)c + "" + (char)ch1 + " ");
				ch1++;
				count++;
				if(count >= n){
				    break;
				}
				
			}
			c++;
			//System.out.println(count);
			if (count >= n){
			    break;
			}
			
		}
		//System.out.println(count);
		
			}
	}
}
		
	


