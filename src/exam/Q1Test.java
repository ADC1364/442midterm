package exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// this test executes the fault but does not result in an error state or failure
	@Test
	public void test1() {
		int [] a1 = {1,2,3,4,5};
		assertEquals(-1, Q1.lastZero(a1));
	}
	
	//this test executes the fault and results in an error state
	@Test
	public void test2() {
		int [] a1 = {0,1,2,0};
		assertEquals(3, Q1.lastZero(a1));
	}
	
	// this test executes the fault, results in an error state but does not result in a failure.
	// the error state exists because the for loop exited before the single element in the array as being a zero or not.
	@Test
	public void test3() {
		int [] a1 = {1};
		
		assertEquals(-1, Q1.lastZero(a1));
		assertEquals(1, Q1.num1);
	}

	
	// the tests below are the same as the one above but are testing the method lastZeroCorrected() method
	// this mthod has the fault corrected
	
	@Test
	public void test4() {
		int [] a1 = {1,2,3,4,5};
		assertEquals(-1, Q1.lastZeroCorrected(a1));
	}
	
	@Test
	public void test5() {
		int [] a1 = {0,1,2,0};
		assertEquals(3, Q1.lastZeroCorrected(a1));
	}
	
	@Test
	public void test6() {
		int [] a1 = {1};
		
		assertEquals(-1, Q1.lastZeroCorrected(a1));
		assertEquals(1, Q1.num2);
	}
	
	
}
