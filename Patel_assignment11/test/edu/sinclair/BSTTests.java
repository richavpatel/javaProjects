/* Richa Patel   
 * Assignment 11
 *  
 */
package edu.sinclair;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTTests {

	private BST<Integer> tree; 
	private BST<String> stringTree; 
	
	@Before
	public void setup() {
		tree = new BST<>(); 
		tree.root = new TreeNode<>(6); 
		tree.root.left = new TreeNode<>(2); 
		tree.root.right = new TreeNode<>(1); 
		tree.root.left.left = new TreeNode<>(4); 
		tree.root.left.right = new TreeNode<>(5); 

		stringTree = new BST<>(); 
		stringTree.root = new TreeNode<>("Richa"); 
		stringTree.root.left = new TreeNode<>("Patel"); 
		stringTree.root.right = new TreeNode<>("Doug"); 
		stringTree.root.left.left = new TreeNode<>("Sam"); 
		stringTree.root.left.right = new TreeNode<>("Roma"); 
	}

	@Test
	public void test_inorder_int() {
		tree.inorder(); 
		System.out.println();
	}
	
	@Test
	public void test_inorder_string() {
		stringTree.inorder(); 
		System.out.println();
	}

	@Test
	public void test_inorder_empty() {
		BST<Integer> tree = new BST<>();
		tree.inorder(); 
		System.out.println();
	}
	
	@Test
	public void test_bft_int() {
		tree.breadthFirstTraversal(); 
		System.out.println();
	}
	
	@Test
	public void test_bft_string() {
		stringTree.breadthFirstTraversal();
		System.out.println();
	}

	@Test
	public void test_bft_empty() {
		BST<Integer> tree = new BST<>();
		tree.breadthFirstTraversal(); 
		System.out.println();
	}
	
	@Test
	public void test_height_int() {
		int height = tree.height(); 
		Assert.assertEquals(height, 3);
	}
	
	@Test
	public void test_height_string() {
		int height = tree.height();
		Assert.assertEquals(height, 3);
	}

	@Test
	public void test_height_empty() {
		BST<Integer> tree = new BST<>();
		int height = tree.height();
		Assert.assertEquals(height, 0);
	}
}
