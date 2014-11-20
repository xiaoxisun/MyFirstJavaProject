package test_Algorithm;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
	        /*
	two pointers? 
	*/
	if (s=="") return true;
	
	char front='\0';
	char end='\0';
	
	int ifront=0;
	int iend=s.length()-1;
	System.out.println(iend);
	while (ifront<iend)
	{
		  System.out.println(iend);
	      front=s.charAt(ifront);
	
	      end=s.charAt(iend);
	
	      if (isAlphanumeric(front) && isAlphanumeric(end)) 	
	      {
	    	  if (Character.toUpperCase(front)==Character.toUpperCase(end)) {ifront++;iend--;}
	    	  else return false;
	      }	else
	      {
		      if(isAlphanumeric(front)) ifront++;
		      if(isAlphanumeric(end)) iend--;	
	      }
	}
	
	return true;
	}
	
	
	public boolean isAlphanumeric(char aChar)
	{
	if((aChar>='a'&&aChar<='z')||(aChar>='A'&&aChar<='Z')||(aChar>='0'&&aChar<='9'))
	    return true;
	else
	    return false;
	}
	
	public static void main(String[] args)
	{
		IsPalindrome A=new IsPalindrome();
		System.out.println(A.isPalindrome("aA"));
		//System.out.println(A.isAlphanumeric('a'));
		
	}
}
