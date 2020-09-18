import java.util.Scanner;
class swap
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X :");
        int x = sc.nextInt();
        System.out.println("Enter Y :");
        int y = sc.nextInt();
        
        // swap
        x = x+y;
        y = x-y;
        x = x-y; 

        System.out.println("After swap value of X: "+x);
        System.out.println("After swap value of Y: "+y);

    }



}