package com.martapanc.datastructures;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Method to insert a new node in the binary search tree
    public void insert(int data) {
        root = insertNode(root, data);
    }

    private TreeNode insertNode(TreeNode currentNode, int data) {
        if (currentNode == null) {
            return new TreeNode(data);
        }

        if (data < currentNode.data) {
            currentNode.left = insertNode(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = insertNode(currentNode.right, data);
        }

        return currentNode;
    }

    // Method to search for a node in the binary search tree
    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(TreeNode currentNode, int data) {
        if (currentNode == null) {
            return false;
        }

        if (data == currentNode.data) {
            return true;
        } else if (data < currentNode.data) {
            return searchNode(currentNode.left, data);
        } else {
            return searchNode(currentNode.right, data);
        }
    }
}

public class BinarySearchTreeExample {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting elements into the binary search tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Searching for elements in the binary search tree
        System.out.println(bst.search(30)); // Output: true
        System.out.println(bst.search(90)); // Output: false
    }
}

