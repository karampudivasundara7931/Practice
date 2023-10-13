package prac;

import java.util.Scanner;

public class fiboseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr =new int[2*n+1];
	       if(n==0){
	           System.out.println(0);
	       }else if(n==1){
	           arr[0]=0;
	           arr[1]=1;
	       }else if(n>1){
	            arr[0]=0;
	           arr[1]=1;
	          
	           for(int i =2;i<=2*n;i++){
	           
	            arr[i] = arr[i-2]+ arr[i-1];
	           
	          
	           }
	       }
	       
	       for(int i=0;i<arr.length;i++){
	       System.out.println(arr[i]);
	       }
	       int sum=0;
	       for(int i =0;i<arr.length;i=i+2){
	           sum = sum + arr[i];
	           
	       }
	       System.out.println(sum);
	}

}
