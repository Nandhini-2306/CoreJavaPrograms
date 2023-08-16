package classEx;

public class StudentEx {
	int rno;
	String name;
	public StudentEx() {
		rno = 3;
		name = "Sandhya";
	}

	public StudentEx(int rno, String nm) {
		this.rno = rno;
		name = nm;
	}
	
	public StudentEx(String nm) {
		rno = 4;
		name = nm;
	}
	
	public StudentEx(StudentEx s) {
		rno = s.rno;
		name = s.name;
	}

	void display() {
		System.out.println("Enter the student roll no: "+rno);
		System.out.println("Enter the student name: "+name);
	}

	public static void main(String[] args) {
		StudentEx s1 = new StudentEx(1, "Paru");
		s1.display();
		StudentEx s = new StudentEx();
		s.rno = 2;
		s.name = "Nandhu";
		s.display();
		StudentEx s2 = new StudentEx();
		s2.display();
		StudentEx s3 = new StudentEx("Sneha");
		s3.display();
		StudentEx s4 = new StudentEx(s3);
		s4.display();

	}
		

}
