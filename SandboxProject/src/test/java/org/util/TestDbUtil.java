package org.util;

import org.junit.Test;
import static org.junit.Assert.*; 
public class TestDbUtil {
	
	@Test
	public void testGetSessionFactory() {
		assertNotNull(DbUtil.getSessionfactory());
	}
}
