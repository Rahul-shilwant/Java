import java.util.Scanner;
class array2{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Enter Element");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();

        }

        for(int i=0 ; i<arr.length ; i++)
        {

            System.out.println("ur array :");
            System.out.println(arr[i]);
        }



    }


}