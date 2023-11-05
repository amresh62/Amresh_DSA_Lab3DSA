package com.gl.bst.services;

import java.util.HashSet;

public class BinarySearchTree {
	
	public Node root;

    
    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) 
        {
            node.left = insert(node.left, data);
        } 
        else if (data > node.data)
        {
            node.right = insert(node.right, data);
        }

        return node;
    }

    
    boolean _findPair(Node root, int target, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        if (_findPair(root.left, target, set))
        {
            return true;
        }

        if (set.contains(target - root.data)) 
        {
            System.out.println("Pair found: (" + (target - root.data) + ", " + root.data + ")");
            return true;
        } 
        else {
            set.add(root.data);
        }

        return _findPair(root.right, target, set);
    }

    public void findPair(Node root, int sum) 
    {
        HashSet<Integer> set = new HashSet<>();
        if (!_findPair(root, sum, set)) 
        {
            System.out.println("Nodes are not found");
        }
    }

}
