package patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pyramid {
 
	public static void main(String args[]) {

		int arr[] = {2,3,1,5,8,4,8,0};
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int userInput = scn.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
	
			if(arr[i]!=userInput) {
				nums.add(arr[i]);
			}
		}
		System.out.println(nums);
	}

}
