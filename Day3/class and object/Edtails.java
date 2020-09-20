class Employee
{

    private int empid;
    private String empname;
    void set(int id , String name)
    {
        empid = id;
        empname =name;

    }
    void show()
    {
        System.out.println(empid+" "+empname);
    }

}
class Edetails{

    public static void main(String[] args) {
        Employee em = new Employee();
        em.set(01 , "Rahul");
        em.show();
    }

}