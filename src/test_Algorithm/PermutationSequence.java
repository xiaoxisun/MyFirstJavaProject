package test_Algorithm;
import java.util.*;

public class PermutationSequence {

ArrayList<Integer> rangeIndex;
boolean[] Used;

public String getP(int n, int k) {
   
	 //
	if (n<2) return "1";
	rangeIndex=new ArrayList<Integer>();
	Used=new boolean[n];

	for (int i=0;i<n;i++)
	{
		Used[i]=false;
		
		if(i==0) rangeIndex.add(1);
		else rangeIndex.add((i+1)*rangeIndex.get(i-1));
		//[1,2,6] 
		
	}

	//
	String sOutput="";
 	int count=k;
	int iRange=rangeIndex.size()-1;
	System.out.println("iRange"+iRange);
	System.out.println("rangeIndex"+rangeIndex.get(iRange));
	while (count>0)
	{
		if (count==1)
		{
			for (int i=0;i<Used.length;i++)
			{
				if(Used[i]==false) sOutput+=(i+1)+"";//add unUsed number from
				count--;
			}	
			continue;
		}
			
		if(count<rangeIndex.get(iRange)) {
			iRange--;
			for (int i=0;i<Used.length;i++)
			{
				if(Used[i]==false) {sOutput+=(i+1)+""; Used[i]=true; break;}//add unUsed number from
				
			}	
		}
		else if(count==rangeIndex.get(iRange)) 
		{
			for (int i=Used.length-1;i>=0;i--)
			{
				if(Used[i]==false) sOutput+=(i+1)+"";//add unUsed number from bigger
				System.out.println(i+":"+sOutput);
			}
			count=0;
		}
		else
		{
			System.out.println(":"+sOutput);
			int current=count/rangeIndex.get(iRange);
			int remain=count % rangeIndex.get(iRange);
			if(remain==0) {
				sOutput+=current+""; 
				Used[current-1]=true;
			}
			else {
				sOutput+=(current+1)+"";
				Used[current]=true;
			}
			count=remain;
		}
	}

    
    return sOutput;
}


	public static void main(String[] args){
		PermutationSequence A=new PermutationSequence();
		String s=A.getP(3, 3);
		System.out.println(s);
	}

}
