package string;

public class StringBufferEx {

	public static void main(String[] args) {
		{
	        StringBuffer s = new StringBuffer("Hii");
	        s.append("Hello");
	        s.append(" ");
	        s.append("world");
	        String message = s.toString();
	        System.out.println(message);
	        System.out.println("Reverse :"+s.reverse());
	        		
	    }
	}
	
}