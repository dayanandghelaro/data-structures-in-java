package Lab_03;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	private int arr [];
	private int nElem;
	public int bswp=0,bcom=0;
	//user defined constructor..
	public BubbleSort(int size) {
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
		}//end of loop
		if(i==nElem) return -1;
		else return i;
	}//end of search loop.
	
	//Ascending Bubble sort method
	public void AscendingBubbleSort() {
		int i,j;
		bcom=0;
		boolean isSwap=false;
		System.out.println("Bubble Sort in ascending order..");
		for(i=0;i<nElem;i++) {
			for(j=0;j<nElem-1;j++) {
				bcom++;
				if(arr[j]>arr[j+1]) {
					this.swap(j, j+1);
					isSwap = true;
					bswp++;
				}
			}//end of inner for loop.
			if(isSwap==false) break;
		}//end of outer for loop.
	}// end of ascending bubble sort method.
	
	//descending bubble sort method.
	public void descendingBubbleSort() {
		int i,j;
		bcom=0;
		boolean isSwap=false;
		System.out.println("Bubble Sort in descending order..");
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
