package example;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*convert string to integer
		int stringExample = Integer.parseInt("geeks",29);
	    System.out.println(stringExample);
	    //convert integer to string , we can use inbuild methods like toString(),valueOf(),concatenate with en=mpty string String s = "" + i;
	    int i= 12345;
	    String s = Integer.toString(i);
	    System.out.println(s);*/
		//swap two strings without using 3rd variable
		 String a="vasu";
	        String b="Cutes";
	        System.out.println("Before swap:" + a + " "+ b);
	        a = a+b; //vasucutes-9-5=4(last substring takes -1 which means if 4 is end one then we will use upto 3 rd
	        b = a.substring(0,a.length()-b.length() );//vasu
	        a = a.substring(b.length(),a.length());
	        
	        System.out.println("After swap:" + a + " "+ b);
	        //remove all vowels from string
	        String s ="vasundara";
	        char[] ch = s.toCharArray();
	        for(int i=0;i<ch.length;i++){
	             if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
	                continue;
	                
	            }else{
	                System.out.println(ch[i]);
	            }
	           
	        }
	        
	}

	

}
