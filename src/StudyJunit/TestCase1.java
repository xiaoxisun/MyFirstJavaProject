package StudyJunit;

import Interface.music5.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		Music5 aTester=new Music5();
		

		System.out.println("test");
		assertEquals("10-5 must be 5",5, Music5.minus(10,5));
	}

}
