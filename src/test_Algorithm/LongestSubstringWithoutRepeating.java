package test_Algorithm;

public class LongestSubstringWithoutRepeating {
	    public int lengthOfLongestSubstring(String s) {
	        //O(n^2)
	        
	        int max=0;
	        
	        if(s.length()==0) return max;
	        
	        for (int i=0;i<s.length();i++)
	        {
	        	String tempS=""+s.charAt(i);
	        	//System.out.println(tempS);
	        	int tempMax=1;
	        	for(int j=i+1;j<s.length();j++)
	        	{
	        		
	        		boolean bDup=false;
	        		for(int k=j-1;k>=i;k--)
	        		{
	        			if(s.charAt(j)!=s.charAt(k)) 
	        			{
	        				continue;
	        			}
	        			else {bDup=true;break;}
	        		}
	        		System.out.println(tempMax);
	        		System.out.println(tempS);
	        		if(bDup==false)
	        		{
	        			tempS=tempS+s.charAt(j);
	        		 	tempMax++;
	        		}else
	        		{
	        			if(tempMax>max) max=tempMax;
	        			break;			
	        		}	
	        	
	        	}	
	        	
	        }
	        
	        return max;
	        
	    }
	    
	    
	    public static void main(String[] args) {
	    	LongestSubstringWithoutRepeating A=new LongestSubstringWithoutRepeating();
	    	int max=A.lengthOfLongestSubstring("abcabcbb");
	      	System.out.println(max);
	    }
}
