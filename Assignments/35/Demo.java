import java.util.*;
import java.lang.Math;
class MathOperation
{

         static int add(int x , int y)
        {
            return x+y;
        }

        static int substract(int x , int y)
                {
                    return x-y;
                }
                
        static int multiply(int x , int y)
                {
                    return x*y;
                }
        
        // static int power(double x , double y)
        //         {
        //             return (int) (Math.pow(x,y));
        //         }
        static int power(int num1, int num2)
            {

             int power = 1 ;

            for(int i = 0 ; i<=num2 ; i++)

              power *= num1 ;
   
              return power ;
            }
}

class Demo
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x  , y;
        System.out.println("Enter value of X :");
        x= sc.nextInt();
        System.out.println("Enter value of Y :");
        y= sc.nextInt();
        
      
        
        System.out.println("Addition :"+MathOperation.add(x,y));
        System.out.println("Substraction :"+MathOperation.substract(x,y));
        System.out.println("Multiplication :"+MathOperation.multiply(x,y));
        System.out.println("Power :"+MathOperation.power(x,y));



    }

}