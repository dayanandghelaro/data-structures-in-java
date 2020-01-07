package Task_02_Priority_Queue;
public class PriorityQueue {
	int size;	//for size of queue
	int arr[];	//for storing numbers
	int nElem;	//present number of items in Queue
///////////////////////////////////////	
	public PriorityQueue(int s) {
		this.size = s;
		arr = new int [size];
		nElem=0;	}//end of constructor.
////////////////////////////////////////	
	public void enQueue(int num) {
		if(nElem==0)
			arr[nElem++]=num;
		else if(nElem==size)
			System.out.println("Queue in full.");
		else {
			int i;
			for(i = nElem-1;i>=0;i--) {
				if(num<arr[i]) 
					arr[i+1]=arr[i];
				else break;
			}
			arr[i+1]=num;
			nElem++;		}//end of else
	}//end of enQueue
//////////////////////////////////////////
	public boolean isFull() {		return (nElem==size);	}
/////////////////////////////////////////	
	public boolean isEmpty() {		return (nElem==0);	}
/////////////////////////////////////////	
	public int deQueue() {//returning maximum value.
		return arr[--nElem];	}//deQueue ended.	
}//end of class.