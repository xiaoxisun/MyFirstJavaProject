package test_Algorithm;
import java.util.*;

public class GrayCode {

    public List<Integer> grayCode(int n) {
		List<Integer> A=new ArrayList<Integer>();
		List<String> B=new ArrayList<String>();
		B=grayCodeSub(n);
		
		for (int i=0;i<B.size();i++)
		{
			A.add(Integer.parseInt(B.get(i),2));
		}
    	
		return A;
    }
    
    public List<String> grayCodeSub(int n){
    	ArrayList<String> A= new ArrayList<String>();

    	if (n==1) {	
    		A.add("0");
    		A.add("1");
    		return A;
    	}
    	
    	if (n>1)
    	{
    		List<String> B=grayCodeSub(n-1);
    		for (int i=0;i<B.size();i++)
    		{
    			A.add("0"+B.get(i));
    		}
    		for (int i=B.size()-1;i>=0;i--)
    		{
    			A.add("1"+B.get(i));
    		}	
    		return A;
    	}

    	return A;   
    }
    
    public static void main(String[] Args){
    	GrayCode acode=new GrayCode();
    	List<Integer> aList=acode.grayCode(2);
    	for (int i=0;i<aList.size();i++)
    	{
    		System.out.println(aList.get(i));
    	}
    	
    }
}
