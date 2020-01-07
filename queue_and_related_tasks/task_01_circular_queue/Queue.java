package Task_01_Circular_Queue;
public class Queue {
	//Fields..
	int size;	//size of Array..
	int arr[];	//Array for Queue
	int nElem;	//number of elements..
	int front,rear;	//front and rear of Queue.
///////////////////////////////////////////////////////
	public Queue(int s) {
		this.size = s;
		arr = new int[size];
		front =0;
		rear =-1;
		nElem=0;
	}//end of constructor.
///////////////////////////////////////////////////////	
	public void enQueue(int num) {//insert element in Queue..
		if(rear==size-1)
			rear=-1;
		arr[++rear]=num;
		nElem++;
	}//end of enQueue
/////////////////////////////////////////////////////
	public int deQueue() {//remove element from Queue.
		int tem= arr[front++];
		if(front==size)
			front =0;
		nElem--;
		return tem;		}//end of deQueue method.
////////////////////////////////////////////////////////
	public boolean isEmpty() {//checking for empty Queue
		return (nElem==0);	}//end of method.
///////////////////////////////////////////////////////	
	public boolean isFull() {//checking for full Queue
		return (nElem==size);	}//end of method.
//////////////////////////////////////////////////////	
	public int getSize() {//size of array..
		return this.size;	}//end of method.
//////////////////////////////////////////////////////	
	public int getNElem() {//number of items..
		return nElem;	}	//end of method.
}//end of class.
