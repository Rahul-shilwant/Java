import java.util.Scanner;
class array{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println("Enter Element");
            arr[i] = sc.nextInt();

        }
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println(arr[i]);
        }



    }


}