import java.util.*;
class MathOperation{

   static int multiplication(int x , int y)
   {
        return x * y;
        
   }
   static float multiplication(float x , float y , float z)
   {
        return x*y*z;
                
   }
   static double multiplication(double x , int y)
   {
       return x*y;
   }

   static void multiplication(int arr[])
   {
    int mul=0;
       for(int i = 0 ; i < 4 ; i++)
       {
        mul = mul * arr[i];
       }
       System.out.println("Multiplication of Attay is :"+mul);
   }
   


   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 4 element in array :");
    int arr[] = new int[4];
    for(int i=0 ; i<4 ; i++)
    {
        arr[i] = sc.nextInt();
    
    }
    MathOperation.multiplication(arr);
    


    ///static method-------------------------------------------------------
    System.out.println("multiplication int int : "+MathOperation.multiplication(10,20));
    System.out.println("multiplication of float float float : "+MathOperation.multiplication(5.5f,5.2f,4.5f));
    System.out.println("multiplication double int : "+MathOperation.multiplication(5,5));
    
    
    

   }


}

