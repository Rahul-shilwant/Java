import java.util.*;
class Employee
{

       private static int empno ;
 
       private static double salary;

       static double totalsalary;

      static int counter = 0;

     
       Employee(double salary)

  {

         this.salary = salary;

         empno = empno+1;

         this.totalsalary = totalsalary+salary;

         counter = counter+1;

 }

        void display()

{

     System.out.println("\nId of empoyee = "+empno);
     System.out.println("Salary of empoyee = "+salary);

  }

    void totalsal()
 {

           System.out.println("\n\nTotalSalary of empoyee = "+totalsalary);
  
            System.out.println("\n\nTotalNumber of empoyee = "+counter);
 
  }

       
  }


   public class EmployeeDemo
{
  
    public static void main(String args[])

{
       // Scanner sc = new Scanner();
       // System.out.println("how many object u want :");
       // int no = sc.nextInt();

       // for(int i= 0 ; i < no ; i++)
       // {
       //        double sal = sc.nextInt();
       //        Employee e = new Employee(sal);      
       // }
       // e.display();
       // e.totalsal();
       


     Employee e1 = new Employee(100);
      e1.display();
     Employee e2 = new Employee(200);
      e2.display();
     Employee e3 = new Employee(300);
      e3.display();

      e3.totalsal();

}

}














// import java.util.*;

// class Employee
// {
//     private int empNo;
//      private double salary;
//     // int totalsal;
//     static int counter = 0;
//     int totalsalary = 0;
    

//     Employee(int empNo , double salary)
//     {


//         this.empNo = empNo;
//         this.salary = salary;
//         counter ++;
    
//     }

//     // void caltotalsal()
//     // {
//     //      this.totalsal;   

//     //       System.out.println("Total Salary"+totalsalary);
//     // }

//     void display()
//     {
//         System.out.println(empNo+" "+salary+"Rs");
        
//     }
    
    
//     void totalemp()
//     {
        
//         System.out.println("Total Employee :"+counter);
//     }
    
// }

// class EmployeeDemo{
//     public static void main(String[] args) {

//         Employee em = new Employee(101,2000);
//         em.display();
    
//        Employee em2 = new Employee(102,4000);
//        em2.display();
    
//        Employee em3 = new Employee(103,6000);
       
//        em3.display();
//        em3.totalemp();
//     //    em3.caltotalsal();
        
//     }
// }