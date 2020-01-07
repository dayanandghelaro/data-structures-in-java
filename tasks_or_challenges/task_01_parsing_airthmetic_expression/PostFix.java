package ParsingAirthmeticExpression;
public class PostFix {
	StackX stack;
	String input;
	int size;
	String output="";
//////////////////////////////////////////	
	public PostFix(String input) {
		this.input = input;
		size = input.length();
		stack = new StackX(size);
	}
/////////////////////////////////////////
	public String getPost() {
		return output;
	}
//////////////////////////////////////////	
	public void doPost() {
		int i;
		char c;
		for(i=0;i<size;i++) {
			c = input.charAt(i);
			switch(c) {
			case '(':
				stack.push(c);
				break;
			case '+':
			case '-':
				if(!stack.isEmpty()) {
					if(stack.peek()=='*'||stack.peek()=='/'){
						output+=stack.pop();
						if(stack.peek()=='+'||stack.peek()=='-') 
							output+=stack.pop();
						stack.push(c);
					}else if((stack.peek()=='+'&&c=='-')||(stack.peek()=='-'&&c=='+')) {
						output+=stack.pop();
						stack.push(c);
					}
					else
						stack.push(c);
				}else
					stack.push(c);
				break;
			case '*':
			case '/':
				if(input.charAt(i-1)==')') {
					stack.push(c);
				}else if(stack.peek()=='*'&&c=='/') {
					output+=stack.pop();
					stack.push(c);
				}else if(stack.peek()=='/'&&c=='*') {
					output+=stack.pop();
					stack.push(c);
				}else
					stack.push(c);
				break;
			case ')':
				while(!stack.isEmpty()) {
					char ch = stack.pop();
					if(ch=='(')
						break;
					else if(ch!='('&&ch!=')') {//TimeStamp built-in.
						output+=ch;
					}
				}
				break;
			default:
					output+=c;
			}//end of switch	
		}//end of for loop
		while(!stack.isEmpty()) {
			output +=stack.pop();
		}
	}//end of doPost method.
}// end of PostFix Class.
///////////////////////////////////////////////////////////////////
class StackX{
	char stack[];
	int size;
	int top;
/////////////////////////////////////////////	
	public StackX(int size) {
		this.size = size;
		stack = new char[size];
		top=-1;
	}
//////////////////////////////////////////	
	public void push(char c) {
		stack[++top]= c;
	}
//////////////////////////////////////////	
	public char pop() {
		return stack[top--];
	}
/////////////////////////////////////////	
	public boolean isFull() {
		return (top==size-1);
	}
/////////////////////////////////////////	
	public boolean isEmpty() {
		return (top<0);
	}
/////////////////////////////////////////
	public char peek() {
		return stack[top];
	}
}//end of StackX class..
