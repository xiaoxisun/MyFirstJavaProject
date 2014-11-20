package net.testPackage;

import java.util.*;
import java.util.Calendar;

class queueDemo{
	public static void printQ(Queue queue){
		while (queue.peek()!=null)
			System.out.println(queue.remove()+"");
		System.out.println();
	}
}

public class SetOfInteger{
	public static void main(String[] args){
		Random rand = new Random(50);
		Set<Integer> intset= new HashSet<Integer>();
		Calendar cal = Calendar.getInstance();
		
		for (int i=0;i<10000;i++){
			intset.add(rand.nextInt(30)*cal.get(Calendar.SECOND));
			 System.out.println(intset);
		}
	}
}

