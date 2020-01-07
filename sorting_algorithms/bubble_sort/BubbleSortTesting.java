package Lab_03;

public class BubbleSortTesting {

	public BubbleSortTesting() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Array obj = new Array(100);
		obj.insert(10);
		obj.insert(22);
		obj.insert(13);
		obj.insert(01);
		obj.insert(-9);
		obj.insert(98);
//		obj.show();
//		obj.searchAndShow(22);
//		obj.delete(22);
//		obj.show();
//		obj.searchAndShow(22);
//		obj.bubbleSort();
//		obj.selectionSort();
//		obj.selectionSortDescending();
//		obj.show();
		obj.insert(-33);
		obj.insert(-78);
		obj.insert(100);
		obj.show();
		obj.bubbleSort();
		obj.show();
		obj.bubbleSortDescending();
		obj.show();
		obj.selectionSort();
		obj.show();
		obj.selectionSortDescending();
		obj.show();
		System.out.println("Selection Sort:\nComparisions = "+obj.scom+"\t Swaps = "+obj.sswp+
				"\nBubble Sort: \nComparisons = "+obj.bcom+"\tSwaps = "+obj.bswp);
//		obj.selectionSort();
//		obj.bubbleSortDescending();
//		obj.show();
	}

}
