package multithreading.com;
import java.util.*;

class Demo implements Runnable
{
    int line;
    Demo(int line)
    {
        this.line = line;
    }

    public void run()
    {
        for(int i=0 ; i<=line ; i++)
        {

            try 
			
			{
				Thread.sleep(1000);
            } 
            
            catch (InterruptedException e)
			{

				 System.out.println(e);

			}
            
            System.out.print("*");

        }


    }

}

public class multiDemo 
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many lines you want");
        int i = sc.nextInt();
        Demo d = new Demo(i);

        Thread t1 = new Thread(d);
        t1.start();


    }


}