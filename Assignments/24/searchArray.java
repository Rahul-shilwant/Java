import java.util.Scanner;
class searchArray
{

    public static void main(String[] args) {
        int flag = 0 , i;       
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[] { 1 , 2 , 3 , 4 , 5};

        System.out.println("ENter Element u want to search :");
        int x = sc.nextInt();

        for( i=0 ; i<arr.length ; i++)
        {
            if(x == arr[i])
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Element found at :"+i);
        else
            System.out.println("Element not found");

    }


}