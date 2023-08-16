package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		EmpEx emp = new EmpEx();
		emp.empid=1;
		emp.empname="Nandhini";
		emp.position="Java Full Stack Developer";
		FileOutputStream fos = new FileOutputStream("Serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("Data saved in file.");

	}

}
