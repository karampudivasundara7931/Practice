package prac;

import java.util.Scanner;

public class removeoccarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] temp = new int[n];
		int rd=0;
		System.out.print("Enter array:");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			
		}
		int key= 3;
		for(int j=0;j<n;j++) {
			if(arr[j]!=key) {
				temp[rd]= arr[j];
				
				rd++;
			}
		}
		
		for(int k=0;k<rd;k++) {
		System.out.println(temp[k]);
		}
	}

}
