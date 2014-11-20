package net.testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainAppTest {

	MainApp tester= new MainApp();
	@Test
	public void test() {
		System.out.println("===start==");
		assertEquals("test","hello terry",MainApp.PrintSth());
		System.out.println("=====end===");
	}

}
