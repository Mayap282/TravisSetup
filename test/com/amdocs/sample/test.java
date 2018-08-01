package com.amdocs.sample;

import junit.framework.TestCase;

public class test extends TestCase{

		public void testAdd() {
			int total = 8;
			int sum = TravisCISample.add(4, 4);
			assertEquals(sum, total);
		}
		
		public void testSub() {
			int diff = 0;
			int sub = TravisCISample.sub(4, 4);
			assertEquals(sub, diff);
		}

}
