import java.util.Scanner;
class leap
{

    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        year = sc.nextInt();

        if( year%4==0 && year%100!=0 || year%400==0 )
        {
            System.out.println("this"+year+"  Year is leap year");
        }
        else
        {
            System.out.println("this"+year+"   Year is Not leap year");
        }

    }

}