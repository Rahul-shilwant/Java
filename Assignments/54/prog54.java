import java.util.*;
class prog54{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		int len=str.length();
		System.out.print("Reverse String = ");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}