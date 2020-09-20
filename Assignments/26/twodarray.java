import java.util.Scanner;
class twodarray{

	public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
    
        // take row from user
        System.out.println("Enter the row size:");
        int row=sc.nextInt();
    
        int arr[][]=new int[row][];
        
        for(int i=0;i<row;i++)
		{
			System.out.println("Enter the how many column u want for "+i+ "- row");
            int col=sc.nextInt();
            arr[i] = new int[col];
            
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter  "+col +" Element");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("*****Element in Array***");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println("");
		}
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum of Element in Array = "+sum);
	}
}