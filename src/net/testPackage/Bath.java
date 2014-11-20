package net.testPackage;

public class Bath{
	private String// 
	    s1="haapy",
	    s2="happy",
	    s3,s4;
	private soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		s3="toy";
		toy=3.14f;
		castille = new soap();
	}
	{i = 47; }
	public String toString(){
		if (s4==null)// Delayed iniialization;
			s4="joy";
		return 
				"s1=" +s1 + "\n"+
				"s2=" +s2 + "\n"+
				"s3=" +s3 + "\n"+
				"s4=" +s4 + "\n"+
				"i=" +i + "\n"+
				"toy=" +toy + "\n"+
				"castille=" + castille;
				
	}
	
	public static void main (String[] args){
		Bath b=new Bath();
		System.out.println(b);
	}
}	