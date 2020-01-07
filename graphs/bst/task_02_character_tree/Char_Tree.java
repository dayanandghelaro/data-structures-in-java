package Task_02;
import java.util.*;
public class Char_Tree {
//--------Attributes------------//
	private Node root;
	private Node current;
	private Node parent;
	private boolean isLeftChild;
	Scanner input=new Scanner(System.in);
//----------------------------------------//
	public Char_Tree() {
		root=null;
	}
//----------------------------------------//
public Node find(char key) {
	current=root;
	while((current != null)&&(current.charData!=key)) {
		parent = current;
		if(key<current.charData) {
			current = current.leftChild;
			isLeftChild = true;
		}
		else if(key>current.charData) {
			current = current.rightChild;
			isLeftChild = false;
		}
	}
	return current;
} 
//-----------------------------------------//
public void insert(char key) {
	Node newNode = new Node(key);
	if(root == null) {
		root = newNode;
	}
	else {
		current = root;
		while(true) {
			parent = current;
			if(key<current.charData)  {
				current = current.leftChild;
				if(current == null) {
					parent.leftChild = newNode;
					return;
				}
			}else {
				current = current.rightChild;
				if(current == null) {
					parent.rightChild = newNode;
					return;
				}
			}//end of else	
		}//end of while
	}//end of else
}
//----------------------------------------//
public boolean delete(char key) {
	Node find=this.find(key);
	if(find==null) {
		return false;
	} //end of if
	else {
		// For having no children (leaf)
		if((find.leftChild == null) && (find.rightChild == null)) {
			if(find == root)
				root = null;
			else if(isLeftChild)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}
			// For having only leftChild
		else if(find.rightChild == null) {
			 if(find == root) 
				 root = find.leftChild;
			 else if(isLeftChild)
				 parent.leftChild = find.leftChild;
			 else 
				 parent.rightChild = find.leftChild;
		 }
			// For having only RightChild
		 else if(find.leftChild == null) {
			 if(find == root) 
				 root = find.rightChild;
			 else if(isLeftChild)
				 parent.leftChild = find.rightChild;
			 else 
				 parent.rightChild = find.rightChild;
		 }
			//for having two children (left and right)
		 else {
			 Node successor = this.getSuccessor(find);
			 if(find == root)
				 root = successor;
			 else if(isLeftChild)
				 parent.leftChild = successor;
			 else 
				 parent.rightChild = successor;
			 successor.leftChild = find.leftChild;
		 }
		 return true; 
	}//end of else
}
//--------------------------------//
private Node getSuccessor(Node delNode) {
	Node successorParent=delNode;
	Node successor=delNode;
	Node current=delNode.rightChild;
	while(current!=null) {
		successorParent=successor;
		successor=current;
		current=current.leftChild;
	}
	if(successor!=delNode.rightChild) {
		successorParent.leftChild=successor.rightChild;
		successor.rightChild=delNode.rightChild;
	}
	return successor;
}
//---------------------------------//
public void show() {
	this.inorder(root);
}
//-----------------------------//
private void inorder(Node startNode) {
	if(startNode!=null) {
		inorder(startNode.leftChild);
		System.out.print(" "+startNode.charData);
		inorder(startNode.rightChild);
	}else
		return;
} 
}
///////////////////////////////////////////////////////////////
class Node {
	public char charData;
	public Node leftChild;
	public Node rightChild;
//-------------------------//
public Node(char c) {
	this.charData = c;
}
//-------------------------//
public void display() {
	System.out.print("("+this.charData+")");
}
}
/////////////////////////////////////////