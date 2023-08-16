package exceptions;

public class ClassFound {

	public static void main(String[] args) {
		try {
			//Class.forName("basic.StaticEx");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class found");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
