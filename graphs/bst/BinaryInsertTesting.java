
public class BinaryInsertTesting {
	public static void main(String args[]) {
		BinaryTree obj = new BinaryTree(14, 14.4);
		obj.insert(10,10.1);	 obj.insert(3,3.3);
		obj.insert(2, 2.2); 	 obj.insert(17, 17.7);
		obj.insert(5, 5.5); 	 obj.insert(15, 15.15);
		obj.insert(16, 16.6);	 obj.insert(12, 12.2);
		obj.insert(19, 19.9);	 obj.insert(7, 7.7);
		obj.insert(1, 1.1);  	 obj.insert(20, 20.2);
		obj.insert(13, 13.3);	 obj.insert(22, 22.2);
		obj.insert(4, 4.4);		 obj.insert(18, 18.8);
		System.out.println("Show in order traversal ");
		obj.InOrderTraversal(obj.root);
		System.out.println("\nDeleting ");
		System.out.println("Delete 2, 5, 13, 15, 19, 22, 3 and 17");
		obj.delete(2).displayNode();		obj.delete(5).displayNode();
		obj.delete(13).displayNode();		obj.delete(15).displayNode();
		obj.delete(19).displayNode();		obj.delete(22).displayNode();
		obj.delete(3).displayNode();		obj.delete(17).displayNode();
		System.out.println("\nNow In order traversal ");
		obj.InOrderTraversal(obj.root);
		System.out.println("Search for 4 and 5");
		obj.search(4);		obj.search(5);
		System.out.println("NOw pre order traversal ");
		obj.PreOrderTraversal(obj.root);
		System.out.println("\nNow post order traversal ");
		obj.PostOrderTraversal(obj.root);
	}//end of main method.

}//end of BinaryInsertTesting
