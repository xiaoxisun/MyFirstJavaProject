package HashExample;

import java.util.*;

class StringAddress {
	private String s;
	public StringAddress(String s) { this.s = s; }
	public String toString() {
		return super.toString() + " " + s;
	}
}

public class FillingLists {
	public static void main(String[] args) {
//		List<StringAddress> list= new ArrayList<StringAddress>(
//				Collections.nCopies(4, new StringAddress("Hello")));
//		System.out.println(list);
//		
//		Collections.fill(list, new StringAddress("World!"));
//		System.out.println(list);
//		
//		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(3);
		
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();

		ArrayList<ArrayList<Integer>> C=new ArrayList<ArrayList<Integer>>();
		
		A.add(a);
		A.add(b);
		System.out.println(A.get(1));
		
		B.add(b);
		
		System.out.println(B);
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.addAll(A.get(1));
		c.addAll(B.get(0));
		
		C.add(c);
		System.out.println(C);
		
	}
} 