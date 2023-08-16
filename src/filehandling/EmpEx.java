package filehandling;

import java.io.Serializable;

public class EmpEx implements Serializable{
		int empid;
		String empname;
		String position;
		public void display() {
			System.out.println("Employee id: "+empid);
			System.out.println("Employee name: "+empname);
			System.out.println("Employee position: "+position);
		}

}


