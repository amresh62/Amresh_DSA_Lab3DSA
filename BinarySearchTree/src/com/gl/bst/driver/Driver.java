package com.gl.bst.driver;
import com.gl.bst.services.BinarySearchTree;
import com.gl.bst.services.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(50);
        tree.root = root;

        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 10);
        
        int sum = 130;
        
        tree.findPair(root, sum);

	}

}
