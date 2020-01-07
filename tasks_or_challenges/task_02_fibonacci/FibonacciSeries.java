package Task_02;
public class FibonacciSeries {
	int size;
	int arr[];
//////////////////////////////////////////	
	public static int count=0;
	public FibonacciSeries(int size) {
		this.size = size;
		arr = new int [size];
	}
////////////////////////////////////////////	
	public void series(int num1,int num2) {
		if(count==size-1)
			System.out.println();
		else if(count==0) {
			System.out.print(num1+"  "+num2+"  ");
		    count++;
		    series(num2,(num1+num2));
		}else{
			System.out.print(num2+"  ");
			count++;
			series(num2,(num1+num2));
		}//end of else.
	}//end of series method.
}//end of class.
