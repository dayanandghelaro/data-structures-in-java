package Lab_03;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	private int arr [];	//array to store data.
	private int nElem;	//number of records in array.
	public int sswp=0,scom=0;
	
	//user defined constructor..
	public SelectionSort(int size) {
		arr = new int[size];
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
		}//end of loop.
		if(i==nElem) return -1;
		else return i;
	}//end of search method.
	
	// Ascending selection sort Method.
	public void AscendingSelectionSort() {
		System.out.println("Selection Sort in Ascending order...");
		int min,index=-1,i,j;
		scom=0;
		sswp=0;
		for(i=0;i<nElem;i++) {
			min = i;
			for(j=i+1;j<nElem;j++) {
				scom++;
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				this.swap(i,min);			
				sswp++;
				}
		}//end of for loop.
	}//end of ascending selection sort method.
	
	
	// descending selection sort method.
	public void descendingSelectionSort() {
		System.out.println("Selection Sorting in Descending order...");
		int max,index=-1,i,j;
		scom=0;
		sswp=0;
		for(i=0;i<nElem;i++) {
			max = i;
			for(j=i+1;j<nElem;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			if(max!=i) { 
				this.swap(i,max);
				sswp++;
			}
		}//end of for loop..
	}//end of descending selection sort class..

	
	
	//swap method
	public void swap(int num1,int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}//end of swap method..
	
	
	//delete method
	public void delete (int num) {
		System.out.println("deleting "+num);
		int srch = this.search(num);
		if(srch>=0) {
			for(int i = srch;i<nElem-1;i++) {
				arr[i]=arr[i+1];
			}
			nElem--;
		}else System.out.println("Sorry! This data doesn't exist.");
	}//end of delete method..
	
	//insert method
	public void insert (int num) {
		arr[nElem]= num;
		nElem++;
	}//end of insert method.	
	
	
	
}
