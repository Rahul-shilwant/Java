import java.util.*;
import java.io.*;

class prog58{
	public static void main(String[] args) {
		String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		int len=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position of day:");
		int position=sc.nextInt();
		
		if(position <= len){
			System.out.println("Day is = "+arr[position]);
		}
	}
}