package collections;

import java.util.HashMap;
import java.util.Map;

public class ElementInsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="john wick";
		char[] ch = s.toCharArray();
	        Map<Character,Integer> mp = new HashMap<Character,Integer>();
	        
	            for(int i =0;i<ch.length;i++){
	            	if(Character.isAlphabetic(ch[i])){
	                if(mp.containsKey(ch[i])){
	                    mp.put(ch[i],mp.get(ch[i]));
	                }else{
	                    mp.put(ch[i],1);
	                }
	            }
	            }
	        
	        System.out.println(mp);
	}

}
