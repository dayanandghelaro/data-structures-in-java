public class BinaryTree {
	Node root;
//-----------------------------------------//	
	public BinaryTree(int id,double dd) {
		root = new Node(id,dd);	//initially set root node.
	}
//--------------------------------------------------//
	public void insert(int id,double dd) {
		Node newNode = new Node(id,dd);	//create new node
		Node node = root;	//start from root
		Node parent = root;
		if(node==null)	//if no nodes in tree.
			root = newNode;	//start at root
		else 
			while(true) {
			if(id<node.id) {	//if id is smaller than node go left
				if(node.left!=null) {	//if node has child
					parent = node;
					node = node.left;
				}else {
					System.out.print("inserting node "); newNode.displayNode();
					System.out.print(" to left of ");node.displayNode();
					System.out.println("");
					node.left = newNode;
					break;
				}
			}else {
				if(node.right!=null) {	//if node has child
					parent = node;
					node = node.right;
				}else {
					System.out.print("inserting node "); newNode.displayNode();
					System.out.print(" to right of ");node.displayNode();
					System.out.println("");
					node.right = newNode;
					break;
				}//end of else				
			}//end of if
		}//end of while
	}//end of method.
//-------------------------------------------------------------------------------//
	public void displayTree() {
	}
//-------------------------------------------//
	public void InOrderTraversal(Node node) {
		if (node == null)
			return;
		if(node.left!=null) 
			InOrderTraversal(node.left);
		node.displayNode();
		System.out.println("");
		InOrderTraversal(node.right);
	}
//--------------------------------------------//
	public void PreOrderTraversal(Node node) {
		if(node == null)
			return;
		node.displayNode();
		PreOrderTraversal(node.left);
		PreOrderTraversal(node.right);
	}
//----------------------------------------------//
	public void PostOrderTraversal(Node node) {
		if(node == null)
			return;
		PostOrderTraversal(node.left);
		PostOrderTraversal(node.right);
		node.displayNode();
	}
//---------------------------------------------//
	public Node find(int id) {
		Node cur = this.root;
		while(cur!=null&&cur.id!=id) {
			if(cur.id>id)
				cur = cur.left;
			else 
				cur = cur.right;
		}//end of while
		return cur;
	}
//----------------------------------------------------------------------------//
	public Node delete(int id) {
		Node cur = root;	//start from root
		Node parent=root;
		boolean isLeft = true;	//if located on left or is left child
		while(cur!=null&&cur.id!=id) {	//until actual location is found
			parent = cur;	//iterator locating current's parent
			if (cur.id>id) {	//if key value is less
				cur = cur.left;	//go to left child
				isLeft = true;	//confirm left child
			}else {	//otherwise
				cur = cur.right;	//go to right child
				isLeft = false;		//it's not left child
			}
		}//end of while
		if(cur!=null) {	//if location is found
			if(cur.left==null&&cur.right==null) {	//deleting node is leaf
				if(cur == root)	//deleting node is root
					root = null;	//tree is deleted
				if(isLeft)	//if it's left leaf
					parent.left=null;	//delete it
				else	//otherwise
					parent.right = null;	//delete right leaf
			}else if(cur.left==null) {//if deleting node has one right child
				if(cur == root)
					root = cur.right;
				else if(isLeft)
					parent.left = cur.right;
				else
					parent.right = cur.right;
			}else if(cur.right== null) {	//if deleting node has one left child
				if(cur == root)
					root = cur.left;
				else if(isLeft)
					parent.left = cur.left;
				else
					parent.right = cur.left;
			}else {//if deleting node has two children
				Node successor = getSuccessor(cur);
				if(cur == root) 
					root = successor;
				else if(isLeft) 
					parent.left = successor;
				else if (!isLeft) 
					parent.right = successor;
				
				successor.left = cur.left;
			}//end of else
		}
		return cur;
	}
//------------------------------------------//
private Node getSuccessor(Node delNode) {	//get successor for getting position of deleting node
	Node successorParent = delNode;
	Node successor = delNode;
	Node current = delNode.right;
	while(current != null) {
		successorParent = successor;
		successor = current;
		current = current.left;
	}
	if(successor != delNode.right) {
		successorParent.left = successor.right;
		successor.right = delNode.right;
	}
	return successor;
}
//-------------------------------------------------------------//	
	public void search(int id) {
		Node found = find(id);
		if(found==null)
			System.out.println("Node with ID "+id+" not found");
		else {
			System.out.print("Found ");
			found.displayNode();
		}
	}
}//end of Binary Search Tree class. 
/////////////////////////////////////////////////////////////////////
class Node {
	Node left;
	Node right;
	int id;
	double dd;
//----------------------------------------------------------//	
	public Node(int id,double dd) {	//for new inserting node.
		this.id = id;	//set integer data
		this.dd = dd;	//set double data
		left = null;	//first it doesn't have any child.
		right = null;
	}
//----------------------------------------------------------//	
	public void displayNode() {
		System.out.print("{ "+id+" , "+dd+" }");
	}
//----------------------------------------------------------//	
}
////////////////////////////////////////////////////////