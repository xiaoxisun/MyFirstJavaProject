
package net.testPackage;

import static java.lang.System.out;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;



public class MainApp {
   public static void main(String[] args) {
	   out.println("hello");
	   tester_EmployeeID();
   }
   
   
   public static void tester_EmployeeID(){
	   Empolyee_EqualHashCode A= new Empolyee_EqualHashCode(1001);
	   Empolyee_EqualHashCode B= new Empolyee_EqualHashCode(1002);
	   
	   HashMap<Empolyee_EqualHashCode, String> aMap=new HashMap<Empolyee_EqualHashCode, String>();
	   aMap.put(A, "Developer");
	   aMap.put(B, "Manager");
	   out.println("aMap"+aMap);
	   
	   Empolyee_EqualHashCode C=new Empolyee_EqualHashCode(1001);
	   if (aMap.containsKey(C)) out.println(aMap.get(C));
	   else out.println("empolyee not found"+C);
	   
	   
   }
   
   public static String PrintSth(){
	   return "hello terry";
   } 
   
   public static void FileNotFoundTest(String sPath){
	   
	   
	
   } 
   
   public static void tester1(){
	   ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      Spring31HelloWorld obj = (Spring31HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();
	      
	      obj.EnumerationTester();
   }
   
   
   
  
}

