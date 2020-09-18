import java.util.Scanner;
class scanner2
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner("123 321");
		
		int i = sc.nextInt();
		
		int j = sc.nextInt();
		int z = i+j;
		System.out.println("Sum is :"+z);
		
	
	}
}