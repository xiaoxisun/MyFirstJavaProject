package net.testPackage;

import static java.lang.System.out;
import Interface.interfaceprocessor.*;

class car implements vehicle {
	public String toString() {return "car";};
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		out.println(this+"'s Engine started");
	}

	@Override
	public void foward() {
		// TODO Auto-generated method stub
		out.println(this+" is fowarding");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		out.println(this+" is backing");
	}
}

public class VehicleImplement{
	public static void main(String[] args){
		car G37=new car();
		G37.startEngine();
	}
}
