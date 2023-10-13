package patterns;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5;
		for (int i = 1; i <= rows; i++) {
            
        	
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
            }
            
            
            for (int k = i; k <= i*2-1; k++) {
                System.out.print(k+ " ");
            }
            for (int k = 2 * i - 2; k>= i; k--) {
                System.out.print(k + " ");
            }
            
            System.out.println();
	}

}
}
