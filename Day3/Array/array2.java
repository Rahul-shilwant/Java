import java.util.*;
class array2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][5];
        System.out.println("Enter Elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr.length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int x[] : arr)
        {
            for(int y : x)
            {
                System.out.print(" "+y);
            }
            System.out.println("");
        }

    }



}