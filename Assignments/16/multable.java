import java.util.Scanner;
class multable
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no U want to Print table");
        int x =  sc.nextInt();
        
        for(int i = 1 ; i<=10 ; i++)
        {
        
            System.out.println(+i+" * "+i*x+" = "+x);

        }



    }



}