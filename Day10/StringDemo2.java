import java.util.Scanner;
public class StringDemo2 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String uname = sc.next();
		System.out.println(uname.isEmpty());
		System.out.println("Enter password");
		String upass = sc.next();
		System.out.println(upass.isEmpty());

		if(uname.equalsIgnoreCase("rahul") && upass.equals("123")) 
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("try again");
		}
	}

}
