package prac;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if(n==0){
           System.out.println(0);
       }else if(n==1){
           System.out.println(0);
           System.out.println(1);
       }else if(n>1){
           System.out.print(0 + " ");
           System.out.print(1 + " ");
           int a=0,b=1;
           for(int i =2;i<=n;i++){
           
           int c = a+b;
           System.out.print(c+ " ");
           a=b;
           b=c;
           
           }
       }
    }
}
