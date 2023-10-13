package prac;

import java.util.Scanner;

public class removearraydup {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] temp = new int[n];
		System.out.println("Enter the array : ");
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
        if(n==0) {
        	System.out.println(0);
        }else if(n==1) {
        	System.out.println(arr[0]);
        	
        }else if(n>2) {
        	for(int j=0;j<n;j++) {
            	
            }
        }
        
	}

}
