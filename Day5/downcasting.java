class Parent
{
    
    
    void show()
    {
        System.out.println("Parent method");
    }

} 
class Child extends Parent
{
    
    void show()
    {
        System.out.println("Child ovveride method");
    }
    
    void show1()
    {
        System.out.println("Child non-static method");
    }

}
class downcasting
{

    public static void main(String[] args) {

        Parent p = new Child();
 
        if(p instanceof Child)
        {
            Child s = (Child)p;
            s.show1();
            s.show();

        }

    }

}