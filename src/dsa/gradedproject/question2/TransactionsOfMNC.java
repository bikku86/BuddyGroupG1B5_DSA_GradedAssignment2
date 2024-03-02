package dsa.gradedproject.question2;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TransactionsOfMNC {
	public Node node;
	public Node previousNode = null;
	public Node nextNode = null;

	void modifyBST(Node root) {
		if (root == null)
			return;

		modifyBST(root.left);
		Node rightNode = root.right;

		if (nextNode == null) {
			nextNode = root;
			root.left = null;
			previousNode = root;
		} else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}
		modifyBST(rightNode);
	}

	void displayModifiedBST(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		displayModifiedBST(root.right);
	}

}
