import java.util.Scanner;
class sumevenodd
{

    public static void main(String[] args) {
    int sum = 0 ,sum1 =0 ,i=0;
    int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("ENter  "+size+" Element");
        
        for( i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        for( i=0 ; i<arr.length ; i++)
        {
            
            if(arr[i]%2 == 0 )
            {
                flag = 1;
                System.out.println("Even number "+arr[i]);     
                sum = sum + arr[i];
                
            }
            else
            {
                flag = 0;
                System.out.println("Odd number "+arr[i]);     
                sum1 = sum1 + arr[i];

            }
            

        }
        if(flag == 1 )
        {         
            System.out.println(" Even number Addition is :"+sum);
        }
        else 
        {
            System.out.println(" Even number Addition is :"+sum1);
        }


    }


}