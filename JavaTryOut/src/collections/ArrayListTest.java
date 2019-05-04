package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		System.out.println(al.size());

		System.out.println("********************");
		System.out.println("Using For Loop");
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("********************");
		System.out.println("Through Iterator");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("********************");
		System.out.println("Using While");
		int num=0;
		while(num<al.size()) {
			System.out.println(al.get(num));
			num++;
		}
		
		System.out.println("********************");
		System.out.println("Using Advanced For Loop");
		for(Integer i:al) {
			System.out.println(i);
		}
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(al);
		System.out.println("al2 contents " +al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.addAll(al2);
		al3.add(100);
		al3.removeAll(al2);
		System.out.println("al2 contents " +al3);

		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.addAll(al2);
		al4.add(60);
		al4.add(70);
		System.out.println("al4 contents " +al4);
		al4.retainAll(al2);
		System.out.println("al4 contents now " +al4);


		
		

		
		
	}
	
}
