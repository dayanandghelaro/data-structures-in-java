package Task_03;
import java.io.*;
public class Directory {
	static FileTree tree=new FileTree();
	public static void main(String a[] ) {
		System.out.println("System started successfully!");
		String dirName = "D:\\1-Study Case\\BSCS-III\\2-Data Structures\\Lab_Tasks\\DSA";
		readFile(dirName);
		tree.show();
		tree.getTotalSize();
		System.out.println("System ended successfully!");
	}
//---------------------------------------------------//
	public static void readFile(String dirName) {	
		File to = new File(dirName);
		String[] path;
		String name = "";
		path = to.list();
		if(path == null)
			return;
		for(int i = 0; i<path.length; i++) {
			name = path[i];
			tree.insert(name, dirName+"\\"+path[i] );
			readFile(dirName+"\\"+path[i]);
		}
	}
}
/////////////////////////////////////////////////////