import java.util.Scanner;
class greatest2
{

    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        a = sc.nextInt();
        System.out.println("Enter B:");
        b = sc.nextInt();
        System.out.println("Enter C:");
        c = sc.nextInt();
    

        int result = c > ( a > b ? a : b) ? c : ((a>b) ? a : b );
        System.out.println("Largest no is :"+result);



    }

}