package Task_01;

import General_Work.DoublyLinkedList;
import General_Work.Link;
import General_Work.SortedLinkedList;

public class FileManager {
	DoublyLinkedList link;
//////////////////////////////////////////////////////	
	public FileManager() {
		link = new DoublyLinkedList();
	}
//////////////////////////////////////////////////////
	public void insertFile(String name, double size) {
		link.insertFirst(name, size);
	}
//////////////////////////////////////////////////////	
	public void sortByName() {
		SortedLinkedList sortLink = new SortedLinkedList();
		Link temp;
		while(!link.isEmpty()) {
			temp = link.removeFirst();
			sortLink.insertSortingByName(temp.getName(), temp.getSize());
		}//end of loop.		
		while(!sortLink.isEmpty()) {
			temp = sortLink.remove();
			link.insertLast(temp.getName(), temp.getSize());
		}//end of loop.
	}
////////////////////////////////////////	
	public void sortBySize() {
		SortedLinkedList sortLink = new SortedLinkedList();
		Link temp;
		while(!link.isEmpty()) {
			temp = link.removeFirst();
			sortLink.insertSortingByNumber(temp.getName(), temp.getSize());
		}
		while(!sortLink.isEmpty()) {
			temp = sortLink.remove();
			link.insertLast(temp.getName(), temp.getSize());
		}//end of loop.
		
	}//end of method.
}//end of the class.
