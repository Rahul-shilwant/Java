
import java.io.IOException;

public class CheckedExeDemo {

	public static void main(String[] args) {
		
		int i = Integer.parseInt("a");  // un checked
		
		try {
			int j = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // checked 
	}

}
