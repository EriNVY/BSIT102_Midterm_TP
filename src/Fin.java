import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin {
	
	public static void main( String[] args) throws IOException {
		
		Scanner scanme = new Scanner(System.in);
		
		System.out.println("Type Your File name:");
		
		FileWriter file = new FileWriter(scanme.next()+".ljbg");
		
		System.out.println("Write text below:");
		
		file.write(scanme.next());
		file.close();
	}
}