package multithreading.com;
import java.util.*;


  class Demo5 implements Runnable
  {
	  
	  int number;
	  
	  int temp = 0;
	  
	  Demo5(int number)
	  {
		  this.number  = number;
	  }

	
	public void run() 
	
	{
		
		 for ( int i = 2 ; i<number/2 ; i++ )

		 {

		        if(number % i == 0)

		  {

		         System.out.println("\nNumber is Not Prime");
		         
		           temp = 1;
		        
		            break;

		  }

		  } 

		     if ( temp == 0 )

		  {

		      System.out.println("\nNumber is Prime");
		       

		 }


		}
		


	}
	  



public class primeDemo1 
{

	public static void main(String[] args)
 {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked");
		
		int num = scanner.nextInt();
		
		 Demo5 d1 = new Demo5(num);
		 
		 Thread t1 = new Thread(d1);
		 
		 t1.start();
		

	}

}