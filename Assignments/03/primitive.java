import java.util.Scanner;
class primitive
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x :");
        int x = input.nextInt();

        // A. y = x2 + 3x - 7 (print value of y) 
        int y = (x*x) + (3*x) - 7;
        System.out.println("Value of Y is :"+y);
        
        
        // B. y = x++ + ++x (print value of x and y)
        y  = x++ + ++x;
        System.out.println("Value of x is : "+x+" Value of Y is :"+y);

        // C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
        int z = x++ - --y - --x  +  x++;
        System.out.println("Value of x is : "+x+"Value of Y is : "+y+"Value of z is : "+z);

        // D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
        
        System.out.println("Enter Value in boolean of x and y");

        boolean x1 = input.nextBoolean();
        boolean y1 = input.nextBoolean();

        boolean z1 = (x1 && y1) || !(x1 || y1);

        System.out.println("value of z is :"+z1);

    }


}