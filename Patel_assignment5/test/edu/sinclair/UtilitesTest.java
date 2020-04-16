package edu.sinclair;

import java.util.ArrayList; 

import java.util.List;

import org.junit.Assert;
import org.junit.Test; 

public class UtilitesTest {

	@Test
	public void testRemoveDuplicatesInteger() {

		Utilities utls = new Utilities();
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(2);
		alist.add(3);
		alist.add(15);
		utls.removeDuplicates(alist);
		Assert.assertEquals(alist.size(), 4);
	}

	@Test
	public void testRemoveDuplicatesString() {
		Utilities utls = new Utilities();
		List<String> alist = new ArrayList<String>();
		alist.add("Hello");
		alist.add("World");
		alist.add("Hello");
		alist.add("ABC");
		alist.add("ABC");
		utls.removeDuplicates(alist);
		Assert.assertEquals(alist.size(), 3);
	}

	@Test
	public void testRemoveDuplicatesLinkedInUser() {
		Utilities utls = new Utilities();
		List<LinkedInUser> alist = new ArrayList<LinkedInUser>();
		LinkedInUser richa = new LinkedInUser();
		richa.setUsername("richa");
		LinkedInUser vivek = new LinkedInUser();
		vivek.setUsername("vivek");
		LinkedInUser doug = new LinkedInUser();
		doug.setUsername("doug");
		LinkedInUser doug2 = new LinkedInUser();
		doug2.setUsername("doug");
		alist.add(richa);
		alist.add(vivek);
		alist.add(doug);
		alist.add(doug2);
		utls.removeDuplicates(alist);
		Assert.assertEquals(alist.size(), 3);
	}

	@Test
	public void testRemoveDuplicatesMisc() {
		Utilities utls = new Utilities();
		List<LinkedInUser> alist = new ArrayList<LinkedInUser>();
		utls.removeDuplicates(alist);
		Assert.assertEquals(alist.size(), 0);

		List<LinkedInUser> users = null;
		utls.removeDuplicates(users);
		Assert.assertEquals(users, null);

		List<LinkedInUser> oneUser = new ArrayList<>();
		LinkedInUser user1 = new LinkedInUser();
		user1.setUsername("user");
		oneUser.add(user1);
		utls.removeDuplicates(oneUser);
		Assert.assertEquals(oneUser.size(), 1);
	}

	@Test
	public void testLinearSearchInteger() {
		Utilities utls = new Utilities();
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		Integer a = utls.linearSearch(alist, 1);
		Assert.assertEquals(a.intValue(), 1);

		Integer b = utls.linearSearch(alist, 10);
		Assert.assertEquals(b, null);
	}

	@Test
	public void testLinearSearchString() {
		Utilities utls = new Utilities();
		List<String> alist = new ArrayList<String>();
		alist.add("Hello");
		alist.add("World");
		alist.add("Hey");
		alist.add("ABC");
		alist.add("EXE");
		String found = utls.linearSearch(alist, "Hey");
		Assert.assertEquals(found, "Hey");

		String notFound = utls.linearSearch(alist, "Richa");
		Assert.assertEquals(notFound, null);
	}

	@Test
	public void testLinearSearchLinkedInUser() {
		Utilities utls = new Utilities();
		List<LinkedInUser> alist = new ArrayList<LinkedInUser>();
		LinkedInUser richa = new LinkedInUser();
		richa.setUsername("richa");
		LinkedInUser vivek = new LinkedInUser();
		vivek.setUsername("vivek");
		LinkedInUser doug = new LinkedInUser();
		doug.setUsername("doug");
		LinkedInUser sam = new LinkedInUser();
		sam.setUsername("sam");
		alist.add(richa);
		alist.add(vivek);
		alist.add(doug);
		alist.add(sam);
		LinkedInUser found = utls.linearSearch(alist, sam);
		Assert.assertEquals(found, sam);

		LinkedInUser samNew = new LinkedInUser();
		samNew.setUsername("sam");

		LinkedInUser samFound = utls.linearSearch(alist, samNew);
		Assert.assertEquals(samFound, samNew);

		LinkedInUser randomUser = new LinkedInUser();
		randomUser.setUsername("other");

		LinkedInUser notFound = utls.linearSearch(alist, randomUser);
		Assert.assertEquals(notFound, null);
	}

	@Test
	public void testLinearSearchMisc() {
		Utilities utls = new Utilities();
		List<LinkedInUser> alist = new ArrayList<LinkedInUser>();

		LinkedInUser toCheck = new LinkedInUser();
		toCheck.setUsername("richa");
		LinkedInUser found = utls.linearSearch(alist, toCheck);
		Assert.assertEquals(found, null);

		List<LinkedInUser> users = null;
		LinkedInUser exists = utls.linearSearch(users, null);
		Assert.assertEquals(exists, null);

		List<LinkedInUser> oneUser = new ArrayList<>();
		LinkedInUser user1 = new LinkedInUser();
		user1.setUsername("user");
		oneUser.add(user1);
		LinkedInUser test = utls.linearSearch(oneUser, user1);
		Assert.assertEquals(test, user1);
	}

}
