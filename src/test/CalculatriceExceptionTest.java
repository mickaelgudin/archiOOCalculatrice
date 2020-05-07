package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import settings.CalculatriceException;

public class CalculatriceExceptionTest {
	
	@Test
	public void CalculExceptionTest() {
		CalculatriceException c = new CalculatriceException(6, "test");
		assertEquals("test",c.getDefaultMessage());
		assertEquals(6,c.getCode());
		c.setCode(5);
		c.setDefaultMessage("nouveau");
		assertEquals("nouveau",c.getDefaultMessage());
		assertEquals(5,c.getCode());
	}

}