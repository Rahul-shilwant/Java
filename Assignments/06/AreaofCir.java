import java.util.Scanner;
class AreaofCir
{   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        int r = sc.nextInt();
        double z = 3.14*r*r;
    
        System.out.println("Area of circumference :" + z);


    }

}