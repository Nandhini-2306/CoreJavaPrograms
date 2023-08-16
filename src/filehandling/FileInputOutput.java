package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("C:/inputoutput.txt");
//		String s = "Hello.. this is Java Full Stack Development Programme..Welcome!!";
//		byte b[] = s.getBytes();
//		fos.write(b);
//		System.out.println("Content written successfully.");
//		FileInputStream fis = new FileInputStream("C:/inputoutput.txt");
//		System.out.println("File content is..");
//		int i = fis.read();
//		while(i!=-1) {
//			System.out.println(i);
//			i=fis.read();
//		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:/inputoutput.txt");
			String s = "Hello.. this is Java Full Stack Development Programme..Welcome!!";
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("Content written successfully.");
			FileInputStream fis = new FileInputStream("C:/inputoutput.txt");
			System.out.println("File content is..");
			int i = fis.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=fis.read();
			}
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("FIle is ended.");
		}

	}

}
