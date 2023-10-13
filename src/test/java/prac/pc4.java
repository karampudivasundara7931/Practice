package prac;

public class pc4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*factorial of num
		int num = 4;
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(fact); */
		
		/*simple interest = (p*t*r)/100
		double p = 1200;
		double t = 2;
		double r = 5.4;
		//int Simpleinterest = (p*t*r)/100;
		
		double Compoundinterest;
		Compoundinterest = p*(Math.pow((1 + r / 100), t));// compound interest = p*(1+r/100)^t
		System.out.println(Compoundinterest); */
		
		// perimeter of the rectange in rectange ,4 sides are there and in that 2 sides are equal to each other so A+B+C+D= A+B+A+B=2(A+B)
		int a = 10;
		int b = 20;
		int perimeter;
		perimeter = 2*(a+b);
		System.out.println(perimeter);
	}

}
