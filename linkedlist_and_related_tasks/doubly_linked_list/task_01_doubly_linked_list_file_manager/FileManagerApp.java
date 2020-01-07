package Task_01;
import java.io.*;
public class FileManagerApp {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		//five files
		FileManager obj = new FileManager();
		File file1 = new File("D:\\DS\\Lab_08\\src\\Raja.txt");
		File file2 = new File("D:\\DS\\Lab_08\\src\\Sham.txt");
		File file3 = new File("D:\\DS\\Lab_08\\src\\Sajan.txt");
		File file4 = new File("D:\\DS\\Lab_08\\src\\Fattah.txt");
		File file5 = new File("D:\\DS\\Lab_08\\src\\Alisha.txt");
		//linking files
		obj.insertFile("Sajan.txt", file3.length());
		obj.insertFile("Raja.txt", file1.length());
		obj.insertFile("Alisha.txt", file5.length());
		obj.insertFile("Sham.txt", file2.length());
		obj.insertFile("Fattah.txt", file4.length());
		//
		obj.link.displayForward();
		System.out.println("\nSorted By File Name: \n");
		obj.sortByName();
		obj.link.displayForward();
		System.out.println("\nSorted By File Size: \n");
		obj.sortBySize();
		obj.link.displayForward();		
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of app.
