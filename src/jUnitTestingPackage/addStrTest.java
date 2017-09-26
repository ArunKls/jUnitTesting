package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addStrTest {

	@Test
	public void test() {
		jUnitTest jUnit=new jUnitTest();
		String res=jUnit.addStrings("ab", "cd");
		assertEquals("abcd",res);
	}

}
