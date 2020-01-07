package DeQueue;
public class Dequeue {
	int arr[];
	int size;
	int front;
	int rear;
	int nElem;
//////////////////////////////////////////////	
	public Dequeue(int num) {	//constructor
		this.size= num;
		arr = new int[size];
		front=0;
		nElem=0;
		rear=-1;
	}//end of constructor
///////////////////////////////////////////////
	public void enQueueFromFront(int num) {
		int i;
		for(i=nElem;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=num;
		nElem++;
	}//end of enqueue from front.
////////////////////////////////////////////////
	public void enQueueFromRear(int num) {
		arr[nElem++]=num;	
	}//end of enqueue from rear.
/////////////////////////////////////////////////
	public int deQueueFromFront() {
		int temp,i;
			temp=arr[0];
			for(i=0;i<nElem-1;i++) {
				arr[i]=arr[i+1];
			}
			nElem--;
			return temp;
	}//end of dequeue from front.
///////////////////////////////////////////////////
	public int deQueueFromRear() {
		int temp=arr[nElem-1];
		nElem--;
		return temp;
	}//end of dequeue from rear.
////////////////////////////////////////////////////
	public boolean isFull() {
		return (nElem==size);
	}//end of full dequeue.
/////////////////////////////////////////////////////
	//Dequeue is empty
	public boolean isEmpty() {
		return (nElem==0);
	}//end of empty dequeue.
////////////////////////////////////////////////////
	public void display() {
		System.out.println("Displaying: ");
		for(int i=0;i<nElem;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}//end of display method.
}//end of Dequeue class..
