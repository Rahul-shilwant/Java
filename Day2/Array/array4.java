import java.util.Scanner;
class array4{


    public static void main(String[] args) {

        // char arr[] = {'r' , 'a' , 'h' , 'u' ,'l'};
        char arr[] = new char[]{'r' , 'a' , 'h' , 'u' ,'l'};
        
        // Traversing (printing the value ) 
        // for(int i=0 ; i<arr.length ; i++)
        // {

        //     System.out.println("ur array :");
        //     System.out.println(arr[i]);
        // }

        for(char a : arr)
        {
            System.out.println(a);
        }

    }

}