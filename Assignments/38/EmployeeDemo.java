import java.util.*;

class Employee
{
    int empNo;
     double salary;
    int totalsal;
    static int counter = 0;
    int totalsalary = 0;
    

    Employee(int empNo , double salary)
    {


        this.empNo = empNo;
        this.salary = salary;
        counter ++;
    
    }

    // void caltotalsal()
    // {
    //      this.totalsal;   

    //       System.out.println("Total Salary"+totalsalary);
    // }

    void display()
    {
        System.out.println(empNo+" "+salary+"Rs");
        
    }
    
    
    void totalemp()
    {
        
        System.out.println("Total Employee :"+counter);
    }
    
}

class EmployeeDemo{
    public static void main(String[] args) {

        Employee em = new Employee(101,2000);
        em.display();
    
       Employee em2 = new Employee(102,4000);
       em2.display();
    
       Employee em3 = new Employee(103,6000);
       
       em3.display();
       em3.totalemp();
       em3.caltotalsal();
        
    }
}