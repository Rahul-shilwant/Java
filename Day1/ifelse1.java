import java.util.Scanner;
class ifelse1
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		if(num==5 && num<5)
		{
				System.out.println(num+"number is equal to 5 and less than 5");
		}
		else
		{
				System.out.println(num+"number greater than 5");
		}
	}
}