package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Olivier
 *
 */

public class ExitWinTest {
	private int count = 10;
	private Map map;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.map = new Map();
		this.map.setCount(count);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Check if the win works
	 */
	@Test
	public void testIsWin() {
		final boolean expected = true;
		if(this.map.getCount() >= 10) {
		this.map.setWin(true);
		} else { 
		this.map.setWin(false);
		}
		assertEquals(expected, this.map.isWin());
	}
}


