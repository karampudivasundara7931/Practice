package patterns;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            //print * for 3rows and 3 columns
		int rows=3;
		int cols=3;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
