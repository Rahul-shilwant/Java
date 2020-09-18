import java.util.Scanner;
class SI
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount "+" Rate " +" Time ");        
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = (p*t*r)/100;

        System.out.println("Simple intrest is :"+si);        

    }


}