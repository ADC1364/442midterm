package exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q5Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// BOR test cases
	@Test
	public void BOR_t1() {
		assertTrue(Q5.goOut(3, 25, true, "Monday"));
	}
	
	@Test
	public void BOR_t2() {
		assertTrue(Q5.goOut(3, 3, true, "Thursday"));
	}
	
	@Test
	public void BOR_t3() {
		assertFalse(Q5.goOut(3, 5, true, "Monday"));
	}
	
	@Test
	public void BOR_t4() {
		assertFalse(Q5.goOut(3, 5, false, "Thursday"));
	}
	
	// BRO test cases
	@Test
	public void BRO_t1() {
		assertTrue(Q5.goOut(10, 30, true, "Monday"));
	}
	
	@Test
	public void BRO_t2() {
		assertTrue(Q5.goOut(5, 20, true, "Monday"));
	}
	
	// because moneyInWallet >= moneyNeeded the result is true for p1 causing p2 to not be evaluated
	@Test
	public void BRO_t3() {
		assertTrue(Q5.goOut(2, 30, true, "Monday"));
	}
	
	@Test
	public void BRO_t4() {
		assertFalse(Q5.goOut(10, 3, true, "Monday"));
	}
	
	@Test
	public void BRO_t5() {
		assertFalse(Q5.goOut(10, 30, false, "Monday"));
	}

}
