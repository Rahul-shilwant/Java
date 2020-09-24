class Parent
{
    int a = 10 ;
    static int b = 20;

    static void display()
    {
        System.out.println("Parent static method");
    }

    void show()
    {
        System.out.println("Parent method");
    }

} 
class Child extends Parent
{
    int a = 100 ;
    static int b = 200;

    static void display()
    {
        System.out.println("Child static method");
    }

    void show()
    {
        System.out.println("Child ovveride method");
    }
    void show1()
    {
        System.out.println("Child non-static method");
    }

}
class upcasting
{

    public static void main(String[] args) {

        Parent p = new Child();
        p.show();
        p.display();
        System.out.println(""+p.a);
        System.out.println(""+p.b);


    }

}