package Lab_03;

class InsertionTestingClass {

	public InsertionTestingClass() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String args[]) {
		InsertionSort obj = new InsertionSort(100);
		obj.insert(5);
		obj.insert(3);
		obj.insert(2);
		obj.insert(8);
		obj.insert(6);
		obj.insert(1);
		obj.insert(9);
		obj.show();
		obj.ascendingInsertionSort();
		obj.show();
		System.out.println("No of Swaps : "+"No of comparisons: ");
		obj.descendingInsertionSort();
		obj.show();
	}
}
