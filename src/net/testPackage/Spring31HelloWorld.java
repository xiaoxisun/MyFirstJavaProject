package net.testPackage;

import java.util.Enumeration;
import java.util.Vector;

public class Spring31HelloWorld{
	private String message;
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println("Your message : "+ message);
	}
	
	public void EnumerationTester(){
		Enumeration<String> days;
		Vector<String> dayNames= new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		days=dayNames.elements();
		while (days.hasMoreElements()){
			System.out.println(days.nextElement());
		}
	}
}

