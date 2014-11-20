package test_Algorithm;
import java.util.*;
public class Combination {
	  public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		  
		    ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		    if (n<=0 ||k<=0||k>n) return A;
		        
		       
		    ArrayList<Integer> a=new ArrayList<Integer>(); 
		    if (n==k) 
		    {
		        for(int i=1;i<=n;i++)
		            a.add(i);
		          
		        A.add(a);    
		    }
		    else if (k<n)
		    {
		      ArrayList<ArrayList<Integer>> B=combine(n-1,k-1);
		      for(Iterator i=B.iterator(); i.hasNext();)
			  {
		    	  ArrayList<Integer> b=(ArrayList<Integer>) i.next();
		    	  b.add(n);
			   }	  
		      if (k-1==0) B.add(new ArrayList<Integer>(Arrays.asList(n)));
		      A.addAll(B);

		      ArrayList<ArrayList<Integer>> C=combine(n-1,k);
		      A.addAll(C);
		    }
		    return A;
		    }
}
