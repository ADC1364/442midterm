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
		assertFalse(Luhn.check("15"));
	}

	// test to get edge and decision coverage
	@Test
	public void test2() {
		assertFalse(Luhn.check("152"));
	}
	
	// test using my credit card number to  get the check method to return true
	@Test
	public void test3() {
		assertTrue(Luhn.check(""));
	}
	
	// test to check the sum and get above 90% mutation coverage in doing so.
	@Test
	public void test4() {
		
		assertFalse(Luhn.check("15"));
		assertEquals(7, Luhn.num);
	}
	
	

}
