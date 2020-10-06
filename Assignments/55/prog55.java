import java.util.*;
class prog55{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=0;
		int len=str.length();
		System.out.print("Reverse String = ");
		for(int i=0;i<len;i++)
		{
			count++;
			if(str.charAt(i) == ' '){
				count--;
			}
		}
		System.out.println("No of words in string = "+count);
	}
}