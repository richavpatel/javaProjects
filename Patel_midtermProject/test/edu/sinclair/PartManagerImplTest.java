package edu.sinclair;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PartManagerImplTest {


	@Test
	public void test() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		Part part = partManager.costPart("290B7266J1");
		Assert.assertEquals(415.16f, part.getPrice(), 0.00);
	}
	@Test
	public void testj2() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		Part part = partManager.costPart("290B7266J2");
		Assert.assertEquals(532.20f, part.getPrice(), 0.00);

	}

	@Test
	public void testj6() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		Part part = partManager.costPart("290B7266J6");
		Assert.assertEquals(334.10f, part.getPrice(), 0.00);

	}
	@Test
	public void test01() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		Part part = partManager.costPart("20-0001");
		Assert.assertEquals(96.39f, part.getPrice(), 0.00);

	}
	@Test
	public void test15() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		Part part = partManager.costPart("20-0015");
		Assert.assertEquals(70.46f, part.getPrice(), 0.00);

	}
	@Test
	public void testFinalAssemblies() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		List<Part> part = partManager.getFinalAssemblies();

		Assert.assertEquals(part.size(), 4);
		Assert.assertEquals(part.get(0).getPartNumber(), "20-0001");
	}
	@Test
	public void testPurchasedPartsByPrice() {
		PartManagerImpl partManager = new PartManagerImpl();
		partManager.importPartStore("bom.json");
		List<Part> part = partManager.getPurchasedPartsByPrice();
		Assert.assertEquals(part.get(0).getPrice(), 19.75f, 0.00);
	}
}

