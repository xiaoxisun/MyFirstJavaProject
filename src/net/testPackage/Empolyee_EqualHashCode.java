package net.testPackage;

import static java.lang.System.out;

public class Empolyee_EqualHashCode{
	
	protected int EmpolyeeID;
	
	public Empolyee_EqualHashCode(int ID){
		this.EmpolyeeID=ID;
	}
	
	public boolean equals(Object o){
		if (!(o instanceof Empolyee_EqualHashCode)) return false;
		if (o==this) return true;
		return ((Empolyee_EqualHashCode) o).EmpolyeeID==this.EmpolyeeID;
	}
	
	
	public int hashCode(){
		return EmpolyeeID;
	}
	
}



