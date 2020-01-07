package Lab_03;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	private int arr [];
	private int nElem;
	public int iswp=0,icom=0;

	//user defined constructor..
	public InsertionSort(int size) {
		arr = new int[size];
		this.nElem=0;
	}
	
	//show method
	public void show () {
		System.out.println("Showing Data:");
		int i;
		for(i=0;i<nElem;i++) {
			System.out.print(arr[i]+" ");
		}//end of for loop
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
		}//end of for loop
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
		}//end of for loop
		if(i==nElem) return -1;
		else return i;
	}//end of search method.
	
	//ascending insertion sort method.
	public void ascendingInsertionSort() {
		int j,i,temp;
		for(i=1;i<nElem;i++) {
			temp = arr[i];
			j=i;
			while(j>0&&arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}//end of inner while loop.
			arr[j]=temp;
		}//end of outer for loop.
	}//end of ascending insertion sort method.
	
	//descending insertion sort method.
	public void descendingInsertionSort() {
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
			}//end of for loop.
			nElem--;
		}else System.out.println("Sorry! This data doesn't exist.");
	}//end of delete method.
	
	//insert method
	public void insert (int num) {
		arr[nElem]= num;
		nElem++;
	}//end of insert method.
}
