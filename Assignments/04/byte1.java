import java.util.Scanner;
class byte1
{
    public static void main(String[] str)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A :");
        byte a = input.nextByte();
        System.out.println("Enter value of B :");
        byte b = input.nextByte();
        
        int c = a + b;
        byte add = (byte)c; //downcasting

        System.out.println("Addition is :"+add);
    }

}