import java.util.Scanner;
class reverse
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no U want to Reverse : ");
        int x =  sc.nextInt();
        int reverse = 0;

        while(x!=0) //x!=0
        {
            int reminder = x % 10;
            reverse = reverse * 10 + reminder;
            x = x/10;
        }
        System.out.println(" Rverse number is  : "+reverse);       

    }

}