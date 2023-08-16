package basic;
class Student{
	public static int fee;
	public static String name;
}
public class StaticEx {

	public static void main(String[] args) {
		Student.fee=2000;
		System.out.println("Fee :"+Student.fee);

	}

}
