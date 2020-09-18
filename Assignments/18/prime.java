import java.util.Scanner;
class prime
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no U want to find prime or not");
        int x =  sc.nextInt();
        boolean temp =false;
        
       
        for(int i=2 ; i<=x/2 ; i++ )
        {
            if(x%2 == 0)
            {
                temp = true;
                break;
            }
            
        }
        if(temp == true)
        {
            
            System.out.println("not prime");
        }
        else
        System.out.println("prime");

    }


}