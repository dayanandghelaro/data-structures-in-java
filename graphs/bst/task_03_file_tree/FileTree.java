package Task_03;
import java.io.File;

public class FileTree {
	private Node root;
	private Node current;
	private Node parent;
	private long size = 0;
//-------------------------//
public FileTree() {
		root=null;
}
//-----------------------------//
public void insert(String name,String address) {
	Node newNode=new Node(name,address );
	if(root==null) {
		root=newNode;
	}
	else {
		current=root;
		while(true) {
			parent=current;
			if(address.compareToIgnoreCase(current.fileAddress)<0)  {
				current=current.leftChild;
				if(current==null) {
					parent.leftChild=newNode;
					return;
				}
			} 
			else {
				current=current.rightChild;
				if(current==null) {
					parent.rightChild=newNode;
					return;
				}
			}
		}
	}
}
//-----------------------------------------//
public void show() {
	System.out.println(" Displaying Data using preorder method....");
	this.preorder(root);
}
//-----------------------------------------//
public void getTotalSize() {
	System.out.println(" Displaying Total size using postorder method....");
	System.out.println("\t"+this.postorder(root)+" bytes");
}		
//--------------------------------------//
private void preorder(Node startNode) {
	if(startNode != null) {
		System.out.println("\t"+startNode.fileName);
		preorder(startNode.leftChild);
		preorder(startNode.rightChild);
	}
}
//-----------------------------------//
public long postorder(Node startNode) {
	if(startNode != null) {
		postorder(startNode.leftChild);
		postorder(startNode.rightChild);
		size += this.getSize(startNode.fileAddress);
	}
	return size;
}
//------------------------------------//
private long getSize(String dirName) {
	long length = 0;
	File file = new File(dirName);
	length = file.length();
	return length;
}
}
///////////////////////////////////////
class Node {
	public String fileName;
	public String fileAddress; 
	public Node leftChild;
	public Node rightChild;
//----------------------------//
public Node(String name, String address) {
	this.fileName = name;
	this.fileAddress = address;
}
//-----------------------//
public void display() {
	System.out.print(" "+this.fileName);
}
}
////////////////////////////////////////