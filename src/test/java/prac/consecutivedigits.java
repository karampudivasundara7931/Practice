package prac;

import java.util.Scanner;

public class consecutivedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0,max=0;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array : ");
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
        for(int j=0;j<n;j++) {
        	if(arr[j]==1) {
        		temp= temp+1;
        	}else {
        		if(temp>max) {
        			max = temp;
        		}
        		temp=0;
        	}
        }
        System.out.println(max);
    }
}
