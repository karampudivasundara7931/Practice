package collections;

import java.util.Arrays;

public class ArraySeperateZerofromNonzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={1,4,0,2,1,3,0,8,5,3,0,0};
        int count =0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=zero){
                arr[count] = arr[i];
                count++;
            }}
            while(count<arr.length) {
            	arr[count] = 0;
            	count++;
          }
        
        System.out.println(Arrays.toString(arr));
	}

}


