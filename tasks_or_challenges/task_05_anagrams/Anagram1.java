import java.util.*;
public class Anagram1 {
	char arr[];	//for storing characters.
	int size;	//size or length of word.
	int count = 0;	//count different word combinations.
//----------------------------//
	public Anagram1(int size) {		//constructor
		this.size = size;	
		arr = new char[size];	//initialize array with word length.
	}
//-------------------------------//	
	public void displayWord() {	//to display each word 
		System.out.print(++count+"- ");
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]);	//display each character
		System.out.print("\t");	//	space between words
		if(count%6==0)
			System.out.println("");	//new line after six words displayed
	}
//-----------------------------------------//
	public void rotate(int newSize) {	//rotate word
		int i;
		int position = this.size - newSize;	
		char temp = arr[position];
		for(i=position;i<size-1;i++) 
			arr[i]=arr[i+1];
		arr[i]=temp;
	}
//-----------------------------------------//
	public void doAnagram(int wordLength) {	//Anagram word
		if(wordLength==1)	//base condition to stop recursion
			return;
		for(int i=0;i<wordLength;i++) {	//do until all words with all of characters in starting
			doAnagram(wordLength-1);
			if(wordLength==2) //when there is unique word
				displayWord();	//display that word
			rotate(wordLength);	//rotate word
		}
	}
//---------------------------------//	
	public static void main(String args[]) {
		String str = new String();
		Scanner input = new Scanner(System.in);
		System.out.println("System Started successfully!\nEnter any English word and see the Magic:");
		str = input.next();
		int length = str.length();
		Anagram1 obj = new Anagram1(length);
		for(int i=0;i<length;i++) 
			obj.arr[i]=str.charAt(i);
		obj.doAnagram(length);
	}//end of main method.

}
