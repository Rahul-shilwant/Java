import java.util.*;
interface StudentFee 
{
    void getFee();
}

class Student implements StudentFee
{
    public void getFee()
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        float fee = sc.nextFloat();

        if(fee < 0)
        {
            throw new ArithmeticException("Invalid FeeException"); 
        }

        else
        {
            System.out.println(""+fee);

        }

    }



}
class prog60{

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.getFee();


    }

}