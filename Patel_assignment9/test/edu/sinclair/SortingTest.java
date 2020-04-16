package edu.sinclair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingTest {

	private String[] unsortedNames;
	private String[] sortedNames;

	private Integer[] unsortedInt;
	private Integer[] sortedInt;
	
	private LinkedInUser[] unsortedLinkedInUsers;
	private LinkedInUser[] sortedLinkedInUsers;
	
	@Before
	public void setup() {
		// Setup runs before each test is executed so NO need to shuffle.
		unsortedNames = new String[] { "Richa", "Vivek", "Sam", "Mary" };
		sortedNames = new String[] { "Mary", "Richa", "Sam", "Vivek" };
		unsortedInt = new Integer[] { 10, 3, 8, 2, 22};
		sortedInt = new Integer[] { 2, 3,8, 10, 22 };
		
		LinkedInUser user1 = new LinkedInUser();
		user1.setUsername("Richa");
		
		LinkedInUser user2 = new LinkedInUser();
		user2.setUsername("Vivek");
		
		LinkedInUser user3 = new LinkedInUser();
		user3.setUsername("Sam");
		
		LinkedInUser user4 = new LinkedInUser();
		user4.setUsername("Mary");
		
		unsortedLinkedInUsers = new LinkedInUser[]{user1, user2, user3, user4};
		sortedLinkedInUsers = new LinkedInUser[]{user4, user1, user3, user2};
	}

	@Test
	public void testIntSort() {
		Sorting ss = new Sorting();
		ss.quickSort(unsortedInt);
		Assert.assertArrayEquals(unsortedInt, sortedInt);
	}
	
	@Test
	public void testStringSort() {
		Sorting ss = new Sorting();
		ss.quickSort(unsortedNames);
		Assert.assertArrayEquals(unsortedNames, sortedNames);
	}
	
	@Test
	public void testUsersSort() {
		Sorting ss = new Sorting();
		ss.quickSort(unsortedLinkedInUsers);
		Assert.assertArrayEquals(unsortedLinkedInUsers, sortedLinkedInUsers);
	}
	
	@Test
	public void testIntSort_Insertion() {
		Sorting ss = new Sorting();
		ss.insertionSort(unsortedInt);
		Assert.assertArrayEquals(unsortedInt, sortedInt);
	}
	
	@Test
	public void testStringSort_Insertion() {
		Sorting ss = new Sorting();
		ss.insertionSort(unsortedNames);
		Assert.assertArrayEquals(unsortedNames, sortedNames);
	}
	
	@Test
	public void testUsersSort_Insertion() {
		Sorting ss = new Sorting();
		ss.insertionSort(unsortedLinkedInUsers);
		Assert.assertArrayEquals(unsortedLinkedInUsers, sortedLinkedInUsers);
	}

}
