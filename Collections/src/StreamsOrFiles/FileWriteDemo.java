package StreamsOrFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//throws is used for delaying the handling of exception
public class FileWriteDemo {
	public void writeData() throws FileNotFoundException, IOException{
		try(FileOutputStream fout =new FileOutputStream("E:/test.txt")){
			int a;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Number");
			a=sc.nextInt();
			fout.write(a);
		}
	}

	public static void main(String[] args) {
		
		FileWriteDemo f1 =new FileWriteDemo();
		try {
			f1.writeData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
