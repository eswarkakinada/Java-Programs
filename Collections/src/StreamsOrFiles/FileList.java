package StreamsOrFiles;

import java.io.File;

public class FileList {
	public  static void showList(){
		File d = new File("F:\\DT-WEB\\mshop");
		String [] list = d.list();
		for(String lst:list){
			System.out.println(lst+"  :is a file");
		}
		File [] list1=d.listFiles();
		for(File f1:list1){
			if(f1.isDirectory()){
				System.out.println(f1+"  :is a directory or folder");
			}
			
		}
	}

	public static void main(String[] args) {
	
      showList();
	}

}
