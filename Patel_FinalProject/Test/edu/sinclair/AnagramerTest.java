package edu.sinclair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class AnagramerTest {

	@Test
	public void testEvaluator_Permute() {
		AnagramEvaluatorImpl evl = new AnagramEvaluatorImpl();
		Set<String> set = new HashSet<>();
		evl.permute("DOG", 0, 2, set);	
		Assert.assertEquals(set.size(), 6);
		
		set = new HashSet<>();
		evl.permute("GAMMA", 0, 4, set);	
		Assert.assertEquals(set.size(), 30);
	}
	
	
	@Test
	public void testEvaluator_IsAnagram() {
		AnagramEvaluatorImpl evl = new AnagramEvaluatorImpl();
		boolean res = evl.isAnagram("DOG", "GOD");
		Assert.assertEquals(res, true);
		
		boolean res1 = evl.isAnagram("DOG", "COD");
		Assert.assertEquals(res1, false);	
		
		boolean res2 = evl.isAnagram("DOG", "dog");
		Assert.assertEquals(res2, true);
		
		Assert.assertEquals(evl.isAnagram(null, "dog"), false);
		Assert.assertEquals(evl.isAnagram(null, null), false);
		Assert.assertEquals(evl.isAnagram("dog", null), false);
		Assert.assertEquals(evl.isAnagram("dog", "dogs"), false);
	}
	
	@Test
	public void testEvaluator_Evaluate() {
		AnagramEvaluatorImpl evl = new AnagramEvaluatorImpl();
		
		List<String> result = evl.evaluate("DOG", "nf");
		List<String> shouldBe = Arrays.asList("DGO", "DOG", "GDO", "GOD", "ODG", "OGD");
		Assert.assertEquals(result, shouldBe);
		
		
		result = evl.evaluate("DOG", "words");
		shouldBe = Arrays.asList("DOG", "GOD");
		Assert.assertEquals(result, shouldBe);
		
		//must be sorted in alpha numeric.
		result = evl.evaluate("DOG", "words");
		shouldBe = Arrays.asList("GOD", "DOG");
		Assert.assertNotEquals(result, shouldBe);
	}
	
}
