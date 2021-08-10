package driver;

import models.BinaryTree;
import models.Node;

public class BinaryTreeTraversal {
	public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(5);
        tree_level.root.left = new Node(9);
        tree_level.root.right = new Node(11);
        tree_level.root.left.left = new Node(12);
        tree_level.root.left.right = new Node(14);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}
