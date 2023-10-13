package patterns;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rows = 5; 
	        
	        for (int i = 1; i <= rows; i++) {
	        	
	        	for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	        	
	            for (int j = 1; j <= (rows - i); j++) {
	                System.out.print(" ");
	            }
	            
	            
	            System.out.println();
	        }
	}

}
