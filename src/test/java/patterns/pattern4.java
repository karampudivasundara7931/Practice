package patterns;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rows = 5; 
	        
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before the stars
	        	
 	            for (int j = 1; j <= (rows - i); j++) {
 	                System.out.print(" ");
	            }
	            
	            // Print stars for this row
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            // Move to the next line after each row
	            System.out.println();
	        }
	}

          }
