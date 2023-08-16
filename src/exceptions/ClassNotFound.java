package exceptions;

public class ClassNotFound {

	public static void main(String[] args) {
		try {
			//Class.forName("class not exist");
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}

