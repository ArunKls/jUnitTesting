package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addNumTest {

	@Test
	public void test() {
		jUnitTest jUnit=new jUnitTest();
		int res=jUnit.addNumbers(200, 200);
		assertEquals(400,res);
	}

}
