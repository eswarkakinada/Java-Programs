package StreamsOrFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Copying data from one file to another = means reading from one file and writing on another file
public class FileCopy {
     
	public static void copyFile(){
		try{
			FileInputStream fin = new FileInputStream("e:/my notes/workpass.txt");
			
			FileOutputStream fout = new FileOutputStream("g:/copiedfile.txt");
			FileInputStream fin1 = new FileInputStream("g:/copiedfile.txt");
			
			int i;
			while((i=fin.read())!=-1){
				fout.write(i);
				
			}
			i=0;
			while((i=fin1.read())!=-1){
				
				
					System.out.print((char)i);
					
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	 
	public static void main(String[] args) {
	
    copyFile();
	}

}
