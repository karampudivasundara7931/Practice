package prac;

import java.util.Arrays;

public class mergearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int[] a = { 10, 20, 30, 40 };
		  
	        // second array
	        int[] b = { 50, 60, 70, 80 };
	  
	        // determines length of firstArray
	        int a1 = a.length;
	        
	        // determines length of secondArray
	        int b1 = b.length;
	        
	        // resultant array size
	        int c1 = a1 + b1;
	  
	        // create the resultant array
	        int[] c = new int[c1];
	  
	        int i=0;
	        for(i=0;i<a1;i++) {
	        	c[i] = a[i];
	        }
	        for(int j=0;j<b1;j++) {
	        	c[i]= b[j];
	        	i++;
	        }
	        
	  
	        // prints the resultant array
	        System.out.println(Arrays.toString(c));
	        
	}

}
