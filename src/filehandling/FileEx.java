package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
		
		public static void main(String[] args) throws IOException {
//		File newFile = new File("C:/ListOfCourses.txt"); 
//		System.out.println("Absolute path :"+newFile.getAbsolutePath());
//		File newFile1 = new File("C:/File/ListOfCourses2.txt");
//		System.out.println("Absolute path: "+newFile1.getAbsolutePath());
//			
//		File newFile2 = new File("C:/Users/User/eclipse-workspace/CorejavaPart1/src/filehandling/ListOfCourses1");
//		System.out.println("Absolute path :"+newFile2.getCanonicalPath());
//		if (newFile2.createNewFile()) { 
//		System.out.println("File created.");
//		} else {
//		System.out.println("File exists.");
//		}
//		System.out.println("Read? "+newFile2.canRead());
//		System.out.println("Write? "+newFile2.canWrite());
//		System.out.println("File name: "+newFile2.getName());
//		System.out.println("File size: "+newFile2.length());
//		System.out.println("Parent: "+newFile2.getParent());
		
		File newFile3 = new File("C:/Users/User/eclipse-workspace/CorejavaPart1/src/basic");
		String[] list = newFile3.list();
		System.out.println("List of files: ");
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}

}
