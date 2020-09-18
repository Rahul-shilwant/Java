import java.util.Scanner;
class temprature
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in Fahrenheit :");
        int F = sc.nextInt();
        float c = (float)5*(F-32)/9;

        System.out.println("Fahrenheit To Celcius: "+c);



    }


}