package Lab_03;

public class SortInDescendingOrder {

	public SortInDescendingOrder() {
		//Auto-generated Constructor
	}
	private int arr[];
	private int nElem;
	
	//User-defined Constructor...
	public SortInDescendingOrder(int size) {
		this.arr = new int[size];
		this.nElem=0;
	}
	
	//show method
	public void show () {
		System.out.println("Showing Data:");
		int i;
		for(i=0;i<nElem;i++) {
			System.out.print(arr[i]+" ");
		}//end of loop.
		System.out.println("");
	}//end of show method.
	
	//search and show method...
	public void searchAndShow(int num) {
		System.out.println("Searching for "+num);
		int i;
		for(i=0;i<nElem;i++) {
			if(arr[i]==num) {
				break;
			}
		}//end of loop.
		if(i==nElem) System.out.println("Not found "+num);
		else System.out.println("Found "+arr[i]+" at index "+i);
	}//end of search and show method.
	
	//search method
	public int search(int num) {
		int i;
		for(i=0;i<nElem;i++) {
			if(arr[i]==num) {
				break;
			}
		}//end of loop
		if(i==nElem) return -1;
		else return i;
	}//end of search loop.
	
	//descending bubble sort method.
	public void descendingBubbleSort() {
		int i,j;
		boolean isSwap=false;
		System.out.println("Bubble Sorting in descending order..");
		for(i=0;i<nElem;i++) {
			for(j=0;j<nElem-1;j++) {
				if(arr[j]<arr[j+1]) {
					this.swap(j, j+1);
					isSwap = true;
				}
			}//end of inner loop.
			if(isSwap==false) break;
		}//end of outer loop.
	}//end of descending bubble sort method.
		
	//descending insertion sort method.
	public void descendingInsertionSort() {
		System.out.println("Insertion Sorting in descending order.");
		int j,i,temp;
		for(i=1;i<nElem;i++) {
			temp = arr[i];
			j=i;
			while(j>0&&arr[j-1]<temp) {
				arr[j]=arr[j-1];
				j--;
			}//end of inner while loop.
			arr[j]=temp;
		}//end of outer for loop.
	}//end of descending insertion sort method.

	// descending selection sort method.
	public void descendingSelectionSort() {
		System.out.println("Selection Sorting in Descending order...");
		int max,index=-1,i,j;
		for(i=0;i<nElem;i++) {
			max = i;
			for(j=i+1;j<nElem;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			if(max!=i) { 
				this.swap(i,max);
			}
		}//end of for loop..
	}//end of descending selection sort class..
	
	
	//swap method
	public void swap(int num1,int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}//end of swap method.

	//delete method
	public void delete (int num) {
		System.out.println("deleting "+num);
		int srch = this.search(num);
		if(srch>=0) {
			for(int i = srch;i<nElem-1;i++) {
				arr[i]=arr[i+1];
			}//end of loop.
			nElem--;
		}else System.out.println("Sorry! This data doesn't exist.");
	}//end of delete method..
	
	
	//insert method
	public void insert (int num) {
		arr[nElem]= num;
		nElem++;
	}//end of insert method.

	
}
