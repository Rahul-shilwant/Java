import java.util.*;
class arraydesc{
	public static void main(String[] args){
        int temp = 0;

		Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.println("Enter Element");
        for(int i=0 ; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i=0 ; i<arr.length ;i++)
        {
            for(int j = i+1 ; j<arr.length ; j++)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        System.out.println(" Decending Array");          

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+ " ");           
        }

	}
}