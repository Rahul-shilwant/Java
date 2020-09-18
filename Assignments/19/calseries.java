import java.util.Scanner;
class calseries
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int x =  sc.nextInt();

        System.out.println("nth position :");
        int num =  sc.nextInt();

        for(int i=1 ; i<=num ; i++)
        {
            x = x + 10 ;
            System.out.println(" "+x);

        }


        
    }


}