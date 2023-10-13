package prac;

import java.util.Arrays;

public class array1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Check if a value is present in an Array in Java
		int arr[] = {1,4,3,8,5};
		int n= 6;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				System.out.print("value present in array at" + i);
				flag=true;
				break;
			}
		}
			if(flag==false) {
				System.out.print("value is not present in array");
			}	*/
		
		/*find largest element in an array
		int arr[] = {10,50,80,20};
		int largest = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		System.out.print(largest); */
		
		/*sort an array 
		int arr[] = { 20,100,40,30,70,80};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr)); */
		
		//sort elements in an descending order(arr[i]<arr[j]) and ascending order(arr[i]>arr[j])
		int arr[] = {20,100,40,30,70,80};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		
	}
		System.out.println(Arrays.toString(arr)); 
		
	}
}
