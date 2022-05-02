package in.lab.dsa.services;

import java.util.HashSet;

public class PairSumBST {
	Node node;
	
	// model of Node
	public static class Node{
		int data;
		Node right;
		Node left;
	}
	
	// method to create new Node
	Node createNode(int key) {
		Node temp = new Node();
		temp.data= key;
		temp.left=null;
		temp.right=null;
		return temp;
	}
	
	
	// method to insert nodes in Binary search tree
	public Node insertNode(Node root, int key) {
		 
		Node node = createNode(key);
		
		if(root == null)
		{
			return node;
		}
		if(root.data > key) {
			root.left = insertNode(root.left, key);
		}else
		{
			root.right = insertNode(root.right, key);
		}
		return root;
		
	}
	
	
	// method to find the pair of nodes with the given sum
	public boolean findPair(Node root, int sum, HashSet<Integer> set) {
		
		if(root == null)
			return false;
		
		if(findPair(root.left, sum, set))
			return true;
		
		if(set.contains(sum-root.data))
		{
			System.out.println("Pair is found (" + (sum-root.data) + "," + root.data +")");
			return true;
		}else
			set.add(root.data);
		
		return findPair(root.right, sum, set);
	}
	
	
	// this method calls the findPair method
	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(!findPair(root, sum, set)) {
			System.out.println("Pair does not exist");
		}
	}

}
