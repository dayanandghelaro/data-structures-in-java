package Lab_03;

public class SortInDescendingOrderApp {
	
	
	public static void main(String args[]) {
		SortInDescendingOrder obj = new SortInDescendingOrder(100);
		System.out.println("Started Program Successfully..");
		//Inserting Random Data:
		obj.insert(22);
		obj.insert(1);
		obj.insert(90);
		obj.insert(34);
		obj.insert(109);
		obj.insert(75);
		obj.insert(4);
		//Show Random Data
		obj.show();
		//Sort in Descending Order with Bubble sort
		obj.descendingBubbleSort();
		//Sort in Descending Order with Selection Sort
//		obj.descendingSelectionSort();
		//Sort in Descending Order with Insertion Sort
//		obj.descendingInsertionSort();
		
		//Again Show sorted Data...
		obj.show();
		System.out.println("Ended Program Successfully..");
	}

}
