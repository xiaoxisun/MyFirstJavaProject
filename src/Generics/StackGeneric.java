package Generics;
import java.util.*;

public class StackGeneric <T> {
	
  private ArrayList<T> stack = new ArrayList<T> ();
  
  private int top = 0;

  public int size () { return top; }

  public void push (T item) {
    stack.add (top++, item);
  }

  public T pop () {
    return stack.remove (--top);
  }

 
 
  public static void main (String[] args) {
	  StackGeneric<Integer> s = new StackGeneric<Integer> ();
     s.push (17);
     s.push (18);
     s.push (19);
      int i = s.pop ();
       i = s.pop ();
      System.out.format ("%4d%n", i);
  }

}
