package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmpEx e = null;
		e = (EmpEx)ois.readObject();
		System.out.println("Data in the file: ");
		e.display();
		ois.close();
		fis.close();
		

	}

}
