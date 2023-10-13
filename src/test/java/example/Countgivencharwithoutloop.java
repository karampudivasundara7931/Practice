package example;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countgivencharwithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*count repititve  given character in a string
		 String input = "geeksforgeeks";
	        char targetChar = 'e';

	        // Remove all instances of the target character from the string
	        String stringWithoutChar = input.replaceAll(String.valueOf(targetChar), "");
	        

	        // Calculate the difference in length to count occurrences
	        int count = input.length() - stringWithoutChar.length();

	        System.out.println("Total occurrences of '" + targetChar + "': " + count); */
		String s="geeksforgeeks";
		int count=0;
		char Mostrepeated =0;
        char[] arr = s.toCharArray();
       Map<Character,Integer> hm = new HashMap<Character,Integer>();
       for(int i=0;i<arr.length;i++){
           if(hm.containsKey(arr[i])){
               hm.put(arr[i],hm.get(arr[i])+1);
           }else{
               hm.put(arr[i],1);
           }
       }
       for(Character c: hm.keySet()) {
    	   if(count<hm.get(c)) {
    		   Mostrepeated = c;
    		   count = hm.get(c);
    	   }
       }
       System.out.println(Mostrepeated + "" + count);
	        
	    }
		

	}


