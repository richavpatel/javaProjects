package edu.sinclair;

import org.junit.Assert;
import org.junit.Test;

public class UserAccountTest {
	
	@Test
	public void testgetUsername() {
		UserAccount name = new UserAccount();
		name.setUsername("Richa");
		name.setPassword("password123");
		Assert.assertEquals(name.getUsername(), "Richa");
	}
	
	@Test
	public void testIsPasswordCorrect() {
		UserAccount name = new UserAccount("Richa", "password123");
		Assert.assertTrue(name.isPasswordCorrect("password123"));
	}
	
	@Test
	public void testIsPasswordNotCorrect() {
		UserAccount name = new UserAccount("Richa", "password123");
		Assert.assertFalse(name.isPasswordCorrect("password123456"));
	}
	
	@Test
	public void testIsPasswordNullCorrect() {
		UserAccount name = new UserAccount("Richa", "password123");
		Assert.assertFalse(name.isPasswordCorrect(null));
	}
	
	@Test
	public void testToString() {
		UserAccount name = new UserAccount();
		name.setUsername("Richa");
		name.setPassword("password123");
		Assert.assertEquals(name.toString(),name.getUsername());
	}
	
	@Test
	public void testEqual() {
		UserAccount name = new UserAccount("Richa", "password123");
		UserAccount name1 = new UserAccount("Richa", "password123");
		Assert.assertTrue(name.equals(name1));
	}
	
	@Test
	public void testNotEqual() {
		UserAccount name = new UserAccount("Richa", "password123");
		UserAccount name1 = new UserAccount(null,"xyz12");
		Assert.assertFalse(name.equals(name1));
	}
	
	@Test
	public void testDiffObject() {
		UserAccount name = new UserAccount("Richa", "password123");
		UserAccount abc = null;
		Assert.assertFalse(name.equals(abc));
	}
	
	@Test
	public void testHashCode() {
		UserAccount value = new UserAccount("Richa", "password");
		int rc = value.hashCode();
		Assert.assertTrue(rc != 0); 
	}
	
	@Test
	public void testHashCodeEmpty() {
		UserAccount value = new UserAccount();
		int rc = value.hashCode();
		Assert.assertTrue(rc != 0); 
	}

}
