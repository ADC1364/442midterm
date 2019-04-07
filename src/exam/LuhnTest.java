/**
 * 
 */
package exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author aviel
 *
 */
public class LuhnTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	// test to get node coverage
	@Test
	public void test1() {
		assertFalse(Luhn.check("55"));
	}

	// test to get edge and decision coverage
	@Test
	public void test2() {
		assertTrue(Luhn.check("1255"));
	}
	
	// tests to check the sum and get above 90% mutation coverage in doing so.
	@Test
	public void test4() {
		
		assertFalse(Luhn.check("15"));
		assertEquals(7, Luhn.num);
	}
	
	// test on my credit card
	@Test
	public void test5() {
		assertTrue(Luhn.check(""));
	}
	
	

}
