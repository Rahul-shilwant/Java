import java.util.Scanner;
class avgarray{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int num = sc.nextInt();
        int sum=0 , avg=0;
        System.out.println("Enter "+num+" Element");
        for(int i=0 ; i<num ; i++)
        {
            int x = sc.nextInt();
            sum = sum + x;
        }
        avg = sum/num;
        System.out.println("Sum is :"+sum);
        System.out.println("AVG is :"+avg);

	}
}