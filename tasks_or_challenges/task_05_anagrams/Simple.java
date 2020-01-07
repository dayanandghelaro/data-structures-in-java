
public class Simple {

	public static void main(String args[]) {
		String word ="CAR";
		Simple obj = new Simple();
		String newWord=word,output="";
		int i;
		System.out.println(word);
		for(i=0;i<obj.factorial(word.length())-1;i++) {
			if((i%2)==0)
				output = ""+newWord.charAt(0)+newWord.charAt(word.length()-1)+newWord.charAt(word.length()-2)+"";
			else 
				output = ""+newWord.charAt(newWord.length()-1)+newWord.substring(1, 2)+newWord.charAt(0);
			System.out.println(output);
			newWord = output;
			output="";
		}
		
		
		
		
	}
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
}
