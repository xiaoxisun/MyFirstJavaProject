package net.testPackage;

class SimpleException extends Exception{
	public SimpleException(){}
	public SimpleException(String msg){super(msg);}
}

public class InheritingExceptions{
	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args){
		InheritingExceptions sed = new InheritingExceptions();
		try{
			sed.f();			
		}catch(Exception e){
			System.out.println("Caught it!");
			e.printStackTrace(System.err);
		}
	}
}