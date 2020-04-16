package edu.sinclair;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LinkedInUserTest {

	@Test
	public void testgetUsername() throws LinkedInException {
		LinkedInUser han = new LinkedInUser();
		han.setUsername("han");

		LinkedInUser luke = new LinkedInUser();
		luke.setUsername("luke");
		LinkedInUser leia = new LinkedInUser();
		leia.setUsername("leia");

		han.addConnection(luke);
		han.addConnection(leia);

		Assert.assertEquals(han.getConnections().size(), 2);
		Assert.assertEquals(han.getConnections().get(0), luke);
		Assert.assertEquals(han.getConnections().get(1), leia);

		han.removeConnection(leia);
		Assert.assertEquals(han.getConnections().get(0), luke);
	}

	@Test
	public void testUserType() {
		LinkedInUser type = new LinkedInUser();
		type.setType("P");
		Assert.assertEquals(type.getType(), "P");
	}

	@Test
	public void testErrorAdd() throws LinkedInException {
		LinkedInUser han = new LinkedInUser();
		han.setUsername("han");

		LinkedInUser luke = new LinkedInUser();
		luke.setUsername("luke");

		han.addConnection(luke);

		LinkedInException exception = assertThrows(LinkedInException.class, () -> han.addConnection(luke));

		final String invalid = "You are already connected with this user";

		Assert.assertEquals(invalid, exception.getMessage());
	}

	@Test
	public void testErrorRemove() throws LinkedInException {
		LinkedInUser han = new LinkedInUser();
		han.setUsername("han");

		LinkedInUser luke = new LinkedInUser();
		luke.setUsername("luke");

		LinkedInUser leia = new LinkedInUser();
		leia.setUsername("leia");

		han.addConnection(luke);

		LinkedInException exception = assertThrows(LinkedInException.class, () -> han.removeConnection(leia));

		final String invalid = "You are NOT connected with this user";

		Assert.assertEquals(invalid, exception.getMessage());
	}

	@Test
	public void testSorting() throws LinkedInException {
		LinkedInUser han = new LinkedInUser();
		han.setUsername("Han");

		LinkedInUser luke = new LinkedInUser();
		luke.setUsername("LUKE");

		LinkedInUser leia = new LinkedInUser();
		leia.setUsername("leia");

		han.addConnection(luke);
		han.addConnection(leia);

		List<LinkedInUser> hanConnections = han.getConnections();
		Collections.sort(hanConnections);
		Assert.assertEquals(hanConnections.get(0), leia);
		Assert.assertEquals(hanConnections.get(1), luke);

	}

}
