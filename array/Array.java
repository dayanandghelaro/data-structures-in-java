package Lab_03;

public class Array {
	private int arr [];
	private int nElem;
	public int bswp=0,bcom=0,sswp=0,scom=0;
	public Array() {
		// TODO Auto-generated constructor stub
	}
	//user defined constructor..
	public Array(int size) {
		arr = new int[size];
		this.nElem=0;
	}
	
	//show method
	public void show () {
		System.out.println("Showing Data:");
		int i;
		for(i=0;i<nElem;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	//search and show method...
	public void searchAndShow(int num) {
		System.out.println("Searching for "+num);
		int i;
		for(i=0;i<nElem;i++) {
			if(arr[i]==num) {
				break;
			}
		}
		if(i==nElem) System.out.println("Not found "+num);
		else System.out.println("Found "+arr[i]+" at index "+i);
	}
	//search method
	public int search(int num) {
		int i;
		for(i=0;i<nElem;i++) {
			if(arr[i]==num) {
				break;
			}
		}
		if(i==nElem) return -1;
		else return i;
		
	}
	// Bubble sort method
	public void bubbleSort() {
		int i,j;
		boolean isSwap=false;
		System.out.println("Bubble Sort in ascending order..");
		for(i=0;i<nElem;i++) {
			for(j=0;j<nElem-1;j++) {
				bcom++;
				if(arr[j]>arr[j+1]) {
					this.swap(j, j+1);
//					isSwap = true;
					bswp++;
				}
			}
//			if(isSwap==false) break;

		}
	}
	//descending order bubble sort
	public void bubbleSortDescending() {
		int i,j;
		boolean isSwap=false;
		System.out.println("Bubble Sort in descending order..");
		for(i=0;i<nElem;i++) {
			for(j=0;j<nElem-1;j++) {
				if(arr[j]<arr[j+1]) {
					this.swap(j, j+1);
					isSwap = true;
				}
			}
//			if(isSwap==false) break;

		}
	}
	
	
	//selection sort Method.
	public void selectionSort() {
		System.out.println("Selection Sort in Ascending order...");
		int min,index=-1,i,j;
		for(i=0;i<nElem;i++) {
			min = i;
			for(j=i+1;j<nElem;j++) {
				scom++;
				if(arr[min]>arr[j]) {
					min=j;
//					index=j;
				}
			}
			if(min!=i) {
				this.swap(i,min);			
				sswp++;
				}
		}
	}
	// descending order selection sort
	public void selectionSortDescending() {
		System.out.println("Selection Sorting in Descending order...");
		int max,index=-1,i,j;
		for(i=0;i<nElem;i++) {
			max = i;
			for(j=i+1;j<nElem;j++) {
				if(arr[max]<arr[j]) {
					max=j;
//					index=j;
				}
			}
			if(max!=i) 
				this.swap(i,max);			
		}
	}

	
	
	//swap method
	public void swap(int num1,int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}
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
	}
	//insert method
	public void insert (int num) {
		arr[nElem]= num;
		nElem++;
	}
}
