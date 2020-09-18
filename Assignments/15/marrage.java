import java.util.Scanner;
class marrage
{

    public static void main(String[] args) {
        
        char ch;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gender : ");
        ch = sc.next().charAt(0);
        System.out.println("Enter Person Age : ");
        age = sc.nextInt();
        
        if(ch == 'm' || ch =='M' || ch =='F' || ch =='f')
        {
            if(age>=18 && ch=='f' || ch=='F')
            {
                System.out.println("yeahh ur ready girl");
            }
            else if(age>=21 && ch=='m' && ch=='M')
            {
                System.out.println("Come on Tumblelya");
            }
            else
            {
                System.out.println("drink milk kid!!!!!!!!!");
            }
        }
        else
        {
            System.out.println("Enter valid input");
        }

    }

}