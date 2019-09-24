package chc.jsj;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FindTest extends FindGivenValue {

	@Before
	public void setUp() throws Exception {
		System.out.println("--begin test--");
	}


	@Test
	public void test() {
		int i = 0;
		int val = 5;
		var result = findA(a, val);
	//	System.out.println("--between test--" + result);
		assertEquals("´íÎó"+ 1, 2, result);
		assertEquals("´íÎó"+ 2, 0,  findA(a,a[0]));
		assertEquals("´íÎó"+ 3, a.length-1,  findA(a,a[a.length-1]));
	//	assertArrayEquals(expecteds, actuals);
	}
		
		

	@After
	public void tearDown() throws Exception {
		System.out.println("--end test--");
	}
}
