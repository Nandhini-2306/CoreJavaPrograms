package loop;

public class Main {
	

	
	public static String Concat(String ... strings) {
		StringBuilder sb = new StringBuilder();
		for(String string:strings) {
			 sb.append(string);
		}
		return sb.toString();
	}


}
