package example;

import java.util.Scanner;

public class consequencenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n,temp=0,max=0;
	        System.out.println("Enter the n value : ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        int[] a = new int[n];
	        System.out.println("Enter the array : ");
	        for(int i=0 ; i < n ; i++){
	            a[i]= sc.nextInt();
	        }
	        for(int j = 0 ; j < n ; j++){
	            if(a[j]==1){
	                temp = temp+1;
	            }
	            else
	            {
	            	if(temp > max) {
	            		max=temp;
	            	}
	                temp= 0;
	            }
	        }
	        
	        System.out.println(max);
	}

}
