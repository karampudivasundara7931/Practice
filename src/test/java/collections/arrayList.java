package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] v1 = {1,2,4,3,5};
		System.out.println(Arrays.toString(v1));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1, 40);
		
		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(60);
		al1.add(70);
		al1.add(90);
		al1.addAll(al);
		
		
		
		System.out.println(al1);
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		al1.clear();
		if(al1.isEmpty()) {
			System.out.println("it is empty");
		}else {
			System.out.println("it is not empty");
		}
		Object[] arr = al.toArray();
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2 = (ArrayList) al.clone();
		System.out.println(al2.contains(20));
		System.out.println(al2.indexOf(30));
		al.set(1, 50);
		System.out.println(al);
		al.sort(Collections.reverseOrder());
		System.out.println(al);
		
		System.out.println(al.subList(0, 2));
	}

}
