import java.util.Scanner;
class cmdargument1
{
	public static void main(String str[])
	{
		String name1 = str[0];
		String name2 = str[1];
		
		int i = Integer.parseInt(name1);
		int j = Integer.parseInt(name2);
		
		int z = i+j;
		
		System.out.println(z);
	
	}
}