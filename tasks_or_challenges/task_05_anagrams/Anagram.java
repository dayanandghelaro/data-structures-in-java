
public class Anagram {
	String word;
	int length;
	int nOfSteps;
	int nOfRecursion;

//---------attributes---------------//	
	public static void main(String args []) {
		Anagram obj = new Anagram();
		String word = "AWFUL";
		String newWord=word;
		int length = word.length();
		int i,count=1,nOfSteps = length,nOfRecursion=length-1;
		int limit = obj.factorial(length)-1;
		String output ="";
		System.out.println(1+" "+word);
		for(i=0;i<length-1;i++) {
			for(int j = 0; j<nOfSteps;j++) {
				if((j%2)==0) {
					output = newWord.substring(0,length-2)+newWord.charAt(length-1)+newWord.charAt(length-2);
				}else if(((j%2)!=0)&&j<=(length/2)) {
					output = newWord.substring(0,length-3)+newWord.charAt(length-1)+
							newWord.substring(length-3,length-1);
				}else if(((j%2)!=0)&&j>(length/2)) {
					output =newWord.substring(0,length-3)+newWord.substring(length-2)+newWord.charAt(length-3);
				}

				System.out.println(++count+" "+output);
				output="";
				if(j==nOfSteps-1)
					newWord="";
				
				
			}//end of inner for loop

			if(i==2) {
				newWord = word.substring(0,1)+word.substring(i+2,i+3)+
					word.substring(1,i+2);
				System.out.println(++count+" "+newWord);
			}else if(i<2) {
				newWord = word.substring(0,1)+word.substring(i+2,i+3)+
				word.substring(1,i+2)+word.substring(i+3);
			System.out.println(++count+" "+newWord);
//			newWord = "";
			}
		}
		
	}//end of main method.
	
//-------------------------------------//	
	public int factorial(int number) {
		int fact=1;
		while(number!=1) {
			fact*=number;
			number--;
		}
		return fact;
	}
//-----End_Of_Factorial---------------//
}//end of anagrams class.
