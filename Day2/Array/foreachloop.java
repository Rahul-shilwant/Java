import java.util.Scanner;
class foreachloop{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Element");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();

        }

        // Traversing (printing the value ) 
        // for(int i=0 ; i<arr.length ; i++)
        // {

        //     System.out.println("ur array :");
        //     System.out.println(arr[i]);
        // }

        for(int a : arr)
        {
            System.out.println(a);
        }

    }

}