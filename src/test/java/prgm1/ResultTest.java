package prgm1;
import org.testng.assert;
import org.testng.annotation.test;

import prgm1.Result;
public class ResultTest {
	@Test
	public void testPass() {
		Assert.assertEquals (Result.display(55), "pass");	
	}
	
	@Test
	public void testFail() {
		Assert.assertEquals (Result.Display(35), "fail");
	}
	
	@Test
	public void testInvalid() {
		Assert.assertEquals(Result.Display(-5),"invalid");
	}
}
	
