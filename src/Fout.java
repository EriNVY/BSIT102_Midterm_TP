import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fout {
	
	public static void main( String[] args) throws IOException {
		
		 Scanner file, read;
		
		System.out.print("Input File Name:");
		file = new Scanner(System.in);
		File f = new File(file.next()+ ".ljbg");
		
		
		read = new Scanner(f);
		System.out.print(read.next());
		
		
	}
}