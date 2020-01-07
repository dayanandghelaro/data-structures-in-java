package Task_02;
import java.util.*;
public class Test_Char_Tree {
	public static void main(String[] args) {
		System.out.println("System started successfully!");
		Scanner input=new Scanner(System.in);
		Char_Tree tree = new Char_Tree();

		tree.insert('V');
		tree.insert('J');
		tree.insert('X');
		tree.insert('A');
		tree.insert('K');
		tree.insert('Z');
		tree.insert('W');
		int choice = 0;
		char ch;
		while(choice!=5) {
			System.out.println("\n1: Insert   2: Find   3: Delete   4: Show   5: Quite");
			System.out.println("Select Any Option: ");
			choice = input.nextInt();
			input.nextLine();
			switch(choice) {
				case 1:
					System.out.print("Enter character to insert : ");
					ch = input.next().charAt(0);
					tree.insert(ch);
					break;
				case 2:
					System.out.print("Enter character to find : ");
					ch = input.next().charAt(0);
					Node temp = tree.find(ch);
					if(temp == null)
						System.out.println("Data does not exist in Binary Search Tree.");
					else
						System.out.println(temp.charData+" Data found.");
					break;
				case 3:
					System.out.print("Enter ch to delete: ");
					ch = input.next().charAt(0);;
					boolean delete = tree.delete(ch);
					if(delete == false)
						System.out.println("Data does not exist in Binary Search Tree.");
					else
						System.out.println(ch+" Deleted Successfully.");
					break;
				case 4:
					System.out.println("Displaying Data from A to Z using Inorder Traversal...");
					tree.show();
					break;
				case 5:
					System.out.println("System Quit Successfully!");
					break;
				default:
						System.out.println("Invalid Option. Please select correct Opton");
				}
			}
		System.out.println("System ended successfully!");
	}

}