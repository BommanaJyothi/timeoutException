package project;

import static org.junit.Assert.*;

/*
 * 1. 1 A character ABCD -BCD
 * 2. 1 A character BACD - BCD
 * 3. 2 A characters AABD - BD
 * 4. 2 A characters  BBAA -BBAA
 * 5. no A character  BCDE - BCDE
 * 6. no characters in string
 */


import org.junit.Before;
import org.junit.Test;


public class Apptestcase {
	App test1;

	@Before
	public void setup() {
		test1=new App();
	}
	@Test
	public void having1Ainfirstcharacter() {	
		assertEquals("BCD",test1.removingA("ABCD"));
	}
	
	@Test
	public void having1Ainsecondcharacter() {
		assertEquals("BCD",test1.removingA("BACD"));
	}

	@Test
	public void having2Ainfirst2characters() {
		assertEquals("CD",test1.removingA("AACD"));
	}
	
	@Test
	public void havingAinlast2characters() {
		assertEquals("BBAA",test1.removingA("BBAA"));
	}
	
	@Test
	public void havingAinfirstandlast2characters() {
		assertEquals("BAA",test1.removingA("AABAA"));
	}
	

	@Test
	public void havingnoA() {	
		assertEquals("BCDE",test1.removingA("BCDE"));
	}
	
	@Test
	public void havingnocharactes() {	
		assertEquals("",test1.removingA(""));
	}
}
