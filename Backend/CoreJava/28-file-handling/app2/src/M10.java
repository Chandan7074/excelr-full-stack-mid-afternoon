

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("test22.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);//enhanced version of file reader
		// it reads entire line
		String s1 = bin.readLine();//retrun string
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();//goes to nextline
		}
		System.out.println("done");
	}
}
