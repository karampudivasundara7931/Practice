package example;



public class ReverseEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = "Hello World Java";
	      char[] ch = input.toCharArray();
	      String reverse ="";
	      for(int i=ch.length-1;i>=0;i--) {
	    	  reverse = reverse + ch[i];
	      }
	      System.out.println(reverse);
	      String result="";
	      String[] rev = reverse.split(" ");
	      for(int i=rev.length-1;i>=0;i--) {
	    	  result = result + rev[i] + " ";
	      }
	      System.out.println(result.trim());
	      
         }
	
         
	}

	


