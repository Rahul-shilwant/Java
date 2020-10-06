import java.util.*;

public class prog57{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the words");
		
		String name = scanner.nextLine();
		
		String arrayname[] = name.split(" ");
		
		String namereserved = "";
		
		int size = arrayname.length;
		
		
		for(int i = 0 ; i<size ; i++)
		{
			
			String str = arrayname[i];
			
			String strprev = "";
			
			int len = str.length();
			
            for(int j = len-1 ; j>=0 ; j-- )
            {
            	
            	strprev = strprev + str.charAt(j);
            	
            }

            namereserved = namereserved + strprev + " " ;
			
		}
		
         System.out.println(namereserved);
		
	}

}
