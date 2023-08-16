package basic;

public class College {
	String name;
	public void LearnerDetails() {
		String name="Nandhu";
		String degree="BE";
		String batch="2023";
		int rno=8203;
		System.out.println(name);
		System.out.println(degree);
		System.out.println(batch);
		System.out.println(rno);
	}
		
	
	public static void main(String[] args) {
		College l= new College();
		l.LearnerDetails();
		l.name="AVC";

	}

}
