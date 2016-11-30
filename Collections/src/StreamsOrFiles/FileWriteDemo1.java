package StreamsOrFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//throws is used for delaying the handling of exception
public class FileWriteDemo1 {
	public void writeData() throws FileNotFoundException, IOException{
		try(FileWriter fout =new FileWriter("E:/tt.txt")){
			String a;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Data");
			
			a=sc.nextLine();
			fout.write(a);
		}
	}
	public void readData() throws FileNotFoundException, IOException{
		try(FileReader fr=new FileReader("E:/tt.txt")){
			int i ;
			
			while((i=fr.read())!=-1) {
				System.out.print((char)i); // typcasting for conversion of askii to words
				
			}
				
			
		}
	}

	public static void main(String[] args) {
		
		FileWriteDemo1 f1 =new FileWriteDemo1();
		try {
			f1.writeData();
			f1.readData();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
