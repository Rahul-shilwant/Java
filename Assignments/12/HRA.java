import java.util.Scanner;
class HRA
{

    public static void main(String[] args) {

        Double bs , da ,Hra ,Gs;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Basic Salary :");
        bs = sc.nextDouble();
    

        if(bs<10000)
        {
            da = bs*0.9;
            Hra = bs*0.1;
        }

        else
        {
            Hra = (double)2000;
            da = bs*0.9;
        }

        Gs = bs+Hra+da;

        System.out.println("Basic Salary : "+bs);
        System.out.println("Dearness Allowance : "+da);
        System.out.println("HRA : "+Hra);
        System.out.println("Gross Salary : "+Gs);


    }



}