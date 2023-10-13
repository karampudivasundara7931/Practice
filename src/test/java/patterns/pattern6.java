package patterns;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=4;
		for(int i=1;i<=rows;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

}
