class Student

 {

      private int age;
      private String name;
     public static int counter;

     int a = 10;

    void setData(int a , String n)

   {

       age = a;

       name = n;



   }

   

     public void show()

 {

       System.out.println("Age = " +age +"\n Name = " +name);

           counter  = counter + 1;

           System.out.println(counter);

}

       

   }

    public class Assign32 
 
  {

     public static void main(String args[])

  {

       Student s1 = new Student();

       Student s2 = new Student();

      Student s3 = new Student();

        s1.show();

        s2.show();

        s3.show();

}

}

}