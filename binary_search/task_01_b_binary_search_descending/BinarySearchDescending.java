package Task_01_B;
public class BinarySearchDescending {
	int arr[];
	int nElem;
/////////////////////////////////////////////////////	
	public BinarySearchDescending(int size) {
		arr = new int [size];
		nElem=0;
	}
/////////////////////////////////////////////////////	
	public int search (int srchkey,int lb,int ub) {
		int cur = (lb+ub)/2;
		if(srchkey==arr[cur])
			return cur;
		else if(lb>ub)
			return nElem;
		else {
			if(srchkey>arr[cur]) 
				ub=cur-1;
			else if(srchkey<arr[cur])
				lb = cur+1;			
			return (search(srchkey,lb,ub));
		}
	}
//////////////////////////////////////////////////////
	public void binarySearch(int key) {
		int find = search(key,0,nElem);
		if(find!=nElem)
			System.out.println("Found "+arr[find]+" at location "+find);
		else
			System.out.println(key+" NOt Found.");
	}
//////////////////////////////////////////////////////
	public void insert(int a) {
		int i;
		for(i=0;i<nElem;i++)
			if(arr[i]<=a)
				break;
		arr[i]=a;
		nElem++;
	}
////////////////////////////////////////////////////////
	public void show() {
		for(int i=0;i<nElem;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("");
	}
}//end of class.
