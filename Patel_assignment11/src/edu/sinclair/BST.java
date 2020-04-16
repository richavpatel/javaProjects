/* Richa Patel    
 * Assignment 11
 *  
 */
package edu.sinclair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class BST<E extends Comparable<E>> {

	protected TreeNode<E> root;
	protected int size = 0;
	
	public BST() { }
	
	public BST(E[] objects) {
		for (int i=0; i<objects.length; i++) {
			insert(objects[i]);
		}
	}
	
	public boolean search(E e) {
		TreeNode<E> current = root;
		
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean insert(E e) {
		if (root == null) {
			root = createNewNode(e);
		} else {
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else {
					return false;
				}
			}
				
			if (e.compareTo(parent.element) < 0) {
				parent.left = createNewNode(e);
			} else {
				parent.right = createNewNode(e);
			}
		}
		
		size++;
		return true;
	}
	
	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<E>(e);
	}
	
	public void inorder() { 
		//inorder(root);
		inOrderTraversalNonRecursive();
	}
	
	protected void inorder(TreeNode<E> root) { 
		if (root == null) return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	
	public void postorder() {
		postorder(root);
	}
	
	protected void postorder(TreeNode<E> root) {
		if (root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}
	
	public void preorder() {
		preorder(root);
	}
	
	protected void preorder(TreeNode<E> root) {
		if (root == null) return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public int getSize() {
		return size;
	}
	
	public TreeNode<E> getRoot() {
		return root;
	}
	
	public ArrayList<TreeNode<E>> path(E e) {
		ArrayList<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> current = root;
		
		while (current != null) {
			list.add(current);
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else {
				break;
			}
		}
		
		return list;
	}
	
	public boolean delete(E e) {
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			} else if (e.compareTo(current.element)> 0) {
				parent = current;
				current = current.right;
			} else {
				break;
			}
		}
		
		if (current == null) {
			return false;
		}
		
		if (current.left == null) {
			if (parent == null) {
				root = current.right;
			} else {
				if (e.compareTo(parent.element) < 0) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
			}
		} else {
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			
			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;
			}
			
			current.element = rightMost.element;
			
			if (parentOfRightMost.right == rightMost) {
				parentOfRightMost.right = rightMost.left;
			} else {
				parentOfRightMost.left = rightMost.left;
			}
		}
		
		size--;
		return true;
	}
	
	public Iterator<E> iterator() {
		return new InorderIterator();
	}
	
	public void clear() {
		root = null;
		size = 0;
	}
	
	private class InorderIterator implements Iterator<E> {
		
		private ArrayList<E> list = new ArrayList<>();
		private int current = 0;
		
		public InorderIterator() {
			inorder();
		}
		
		private void inorder() {
			inorder(root);
		}
		
		private void inorder(TreeNode<E> root) {
			if (root == null) return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}
		
		public boolean hasNext() {
			return current < list.size();
		}
		
		public E next() {
			return list.get(current++);
		}
		
		public void remove() {
			delete(list.get(current));
			list.clear();
			inorder();
		}
	}

	public void breadthFirstTraversal() {
		// get the height
		int height = height(); 
        int n; 
        // go over from 0 to height and print each level.
        for (n=1; n<=height; n++) {
        	printSingleLevel(root, n); 
        }	
	}
	
	private void printSingleLevel(TreeNode<E> node, int levelNumber) {
		if(node == null) {
			return;
		}
		// If at first level, print element. 
		if(levelNumber == 1) {
			System.out.print(node.element + " ");
		} else {
			// divide into two, left nodes and right nodes.
			printSingleLevel(node.left, levelNumber-1);
			printSingleLevel(node.right, levelNumber-1);
		}
	}

	public int height() {
		return heightRecursive(root);
	}

	private int heightRecursive(TreeNode<E> root) {
		if(root == null) {
			return 0;
		}
		//compute the left height.
		int leftHeight = heightRecursive(root.left);
		int rightHeight = heightRecursive(root.right);
		
		// return maximum of left height or right height. 
		return (Math.max(leftHeight, rightHeight) + 1);
	}

	public void inOrderTraversalNonRecursive() {
		if(root == null) {
			return;
		}
		Stack<TreeNode<E>> stackElements = new Stack<>(); 
        TreeNode<E> current = root; 
        while (current != null || stackElements.size() > 0) { 
        	while (current !=  null) { 
            	stackElements.push(current); 
                current = current.left; 
            } 
            current = stackElements.pop(); 
  
            System.out.print(current.element + " "); 
            current = current.right; 
        } 
	}
}
