
		
		package patterns;

import java.util.Scanner;

public class excelmanju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n,k=0,var=65,row=0,start=64;
	        System.out.println("Enter the n value : ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        for(int i=0 ; i< n ; i++){
	            if(k==26){
	                k=0;
	                start++;
	                row++;
	                var=65;
	            }
	            else if(row==0){
	                System.out.print((char)var+" ");
	                var++;
	                k++;
	                }
	            else {
	                System.out.print((char)start+""+(char)var+" ");
	                var++;
	                k++;
	            }
	            
	        }
	}

}
