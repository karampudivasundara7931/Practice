package prac;

public class P2 {
	
	
	
	/*findlcm ,here ex ,7 and 3 then checking max value and with that max value need to check that both given numbers are divisible by 0 
	static int lcm(int a,int b) {
		
		int max = a>b ? a:b;
		while(true) {
			if(max%a==0 && max%b==0) {
				break;
			}
			max++;
		}
		return max;
		
	}*/
	
	/*program to add two binary numbers
	
	static String add_Binary(String x, String y) {
		int num1 = Integer.parseInt(x,2);
		int num2 = Integer.parseInt(y,2);
		int sum = num1 + num2;
		String num3 = Integer.toBinaryString(sum);
		System.out.println(num3);
		
		
		return num3;
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String x = "01101";
		String y = "11010";
		add_Binary(x,y);*/
		/*findnum is odd r even
		int n=11;
		if(n%2==0) {
			System.out.println("given num is even");
		}else {
			System.out.println("given num is odd");
		}*/
		
		/*find largest among three numbers
		int x= 8;
		int y= 9;
		int z= 7;
		// easy way to find largest is int largest = z > (x>y ? x:y) ? z:((x>y) ? x:y); // 
		if(x>y && x>z) {
			System.out.println("x is large");
		}else if(y>z && y>x) {
			System.out.println("y is large");
		}else {
			System.out.println("z is large");
		}*/
		
		/*Java Program to Find LCM of Two Numbers
		
		int a = 7;
		int b = 3;
		System.out.println(lcm(a,b));*/
		// find hcf or gcd
		int a = 20;
		int b = 15;
		int min = (a<b)?a:b;
		for(int i = min;i>=0;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
				
	}

}
