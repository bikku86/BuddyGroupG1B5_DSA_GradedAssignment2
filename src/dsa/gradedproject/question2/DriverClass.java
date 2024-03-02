package dsa.gradedproject.question2;

public class DriverClass {

	public static void main(String[] args) {

		TransactionsOfMNC tree = new TransactionsOfMNC();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.left.left.right = new Node(20);
		tree.node.right.left = new Node(55);

		tree.modifyBST(tree.node);

		System.out.println("Output\n");
		tree.displayModifiedBST(tree.nextNode);
	}

}
