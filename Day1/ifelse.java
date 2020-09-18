import java.util.Scanner;
class ifelse
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		if(num%2==0)
		{
				System.out.println(num+"number is even");
		}
		else
		{
				System.out.println(num+"number is odd");
		}
	}
}