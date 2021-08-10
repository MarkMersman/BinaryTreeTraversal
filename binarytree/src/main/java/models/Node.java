package models;

public class Node {
	int data;
	public Node left;
	public Node right;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}
