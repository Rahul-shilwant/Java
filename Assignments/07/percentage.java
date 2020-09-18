import java.util.Scanner;
class percentage
{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 5 subject Marks below out of 100....");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int sum = a+b+c+d+e;

            double p = sum*100/500;
            
            System.out.println("percentage marks :  "+p+"%");

        }



}