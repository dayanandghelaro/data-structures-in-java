package SingleEndedList;
public class LinkedListManipulation extends LinkedList{
	public LinkedListManipulation() {
		super();
	}//end of constructor.
///////////////////////////////////////////////	
	public void search(int id) {
		System.out.println("Searching : "+id);
		if(!super.isEmpty()) {
			Link tem = super.find(id);
			if(!(tem==null)) {
				System.out.print("Found\t");
				tem.display();
				System.out.println("");
			}else
				System.out.println(id+" id not found");
		}else
			System.out.println("List is empty.");
	}//end of search.
///////////////////////////////////////////////////////////	
	public void deleteAnyWhere(int idd) {
		System.out.println("Deleting : "+idd);
		Link temp = super.delete(idd);
		if(!(temp==null)){
			temp.display();
			System.out.println(idd+ " is Deleted ");
		}else
			System.out.println("This data doesn't exists.");
	}//end of method.
}//end of class
