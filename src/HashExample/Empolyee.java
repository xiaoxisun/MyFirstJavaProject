package HashExample;
import java.util.Hashtable;

//A class that’s used as a key in a HashMap
//must override hashCode() and equals().
public class Empolyee {
	public String ID;
	
	public Empolyee(String id){
		ID=id;
	} 
	  
	//@Override
	public int hashCode()
	{
		
		return Integer.parseInt(ID);
		
	}
	
	//@Override
	public boolean equals(Object e)
	{
		if(!(e instanceof Empolyee)){
			return false;
		}
		
		if(e==this) return true;
		
		Empolyee E=(Empolyee) e;
		if(E.ID==this.ID) return true;
		else return false;
		
			
	}
	
	public void testpassbyvalue(int A)
	{
		System.out.println("A="+A);
		A=10;
		return;
	}
	
	
	public static void main(String[] args)
	{
		Hashtable<Empolyee, String> ahash=new Hashtable<Empolyee, String>();
		ahash.put(new Empolyee("001"), "Jack");
		ahash.put(new Empolyee("002"), "Albert");
		ahash.put(new Empolyee("003"), "Tank");
		
		Empolyee aNew=new Empolyee("003");
		int a=11;
		aNew.testpassbyvalue(a);
		System.out.println(a);
		System.out.println("test:"+ahash.containsKey(new Empolyee("002")));
		
		
		
		
		return;
	}
	
		
}
