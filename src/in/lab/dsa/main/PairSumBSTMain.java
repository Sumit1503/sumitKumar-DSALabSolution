package in.lab.dsa.main;

import in.lab.dsa.services.PairSumBST;

public class PairSumBSTMain {

	public static void main(String[] args) {
		
		PairSumBST ps = new PairSumBST();
		PairSumBST.Node root = null;
		
		// hard-coding the datas of BST
		root = ps.insertNode(root, 40);
		root = ps.insertNode(root, 10);
		root = ps.insertNode(root, 50);
		root = ps.insertNode(root, 20);
		root = ps.insertNode(root, 60);
		root = ps.insertNode(root, 30);
		root = ps.insertNode(root, 70);
		
		int sum = 50;
		ps.findPairWithGivenSum(root, sum);

	}

}
