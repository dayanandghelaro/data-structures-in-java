
public class Graph {
	public final int MAX_VERTICES = 20;
	StackX stack;
	int nVertices;
	Vertex vertexList[];
	int adjMatrix[][];
	
//--------------------------------------------------------//
	public Graph() {
		vertexList = new Vertex[MAX_VERTICES];
		stack = new StackX();
		adjMatrix = new int [MAX_VERTICES][MAX_VERTICES];
		nVertices = 0;
		for (int i = 0; i<MAX_VERTICES; i++)
			for( int j = 0; j<MAX_VERTICES; j++)
				adjMatrix[i][j] = 0;
	}
//--------------------------------------------------------//	
	public void addVertex(char label) {
		vertexList[nVertices++]= new Vertex(label);
	}
//-------------------------------------------------------//
	public void addEdge(int start, int end) {
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
//------------------------------------------------------//
	public void displayVertex(int i) {
		System.out.println(vertexList[i].label);
	}
//------------------------------------------------------//
	public int getAdjUnvisitedVertex(int v) {
		for(int i = 0;i<nVertices;i++) 
			if((adjMatrix[v][i]==1)&&(vertexList[i].isVisited==false)) 
				return i;
		return -1;
	}
//-------------------------------------------------------------------//
	
	
}//end of Graph class
////////////////////////////////////////////////
class StackX{
	private final int MAX_SIZE = 20;
	int arr[];
	private int top;
//------------------------------------//
	public StackX() {
		top = -1;
		arr = new int[MAX_SIZE];
	}
//----------------------------------//
	public void push(int num) {
		arr[++top]=num;
	}
//---------------------------------//
	public int pop() {
		return arr[top--];
	}
//--------------------------------//
	public boolean isEmpty() {
		return (top == -1);
	}
}//end of StackX class.
////////////////////////////////////////////////////////
class Vertex{
	char label;
	boolean isVisited;
//------------------------------//	
	public Vertex(char label) {
		this.label = label;
		isVisited = false;
	}
}//end of Vertex Class.


