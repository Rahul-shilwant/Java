import java.util.*;
class prog56{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		String arr[] = str.split(" ");
		
		int len=arr.length;
		System.out.println("Your string = ");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i].substring(0,1).toUpperCase());
		         
		    System.out.print(arr[i].substring(1,arr[i].length()) + " ");
			
		}
	}
}
