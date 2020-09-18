import java.util.Scanner;
class dowhile1
{

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any number");
            int n = sc.nextInt();

            do{
                System.out.println(n);
                n++;

            }
            while(n<10);

    }

}