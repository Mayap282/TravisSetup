package com.amdocs.sample;

import junit.framework.TestCase;

public class JUnitTests extends TestCase{

		public void testAdd() {
			int total = 8;
			int sum = TravisSetup.add(4, 4);
			assertEquals(sum, total);
		}
		
		public void testSub() {
			int diff = 0;
			int sub = TravisSetup.sub(4, 4);
			assertEquals(sub, diff);
		}

}
