package collections;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Setprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(3);
		//HashSet means insert order and Treeset means sorting order
		System.out.println(s);
		
			for(int num : s) {
			System.out.println(num);
		}
		Iterator<Integer> it = s.iterator();
		//hasNext - to check whether next value exist in loop or not 
		//next() - it is similar to i++
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
