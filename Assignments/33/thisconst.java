class A
{
    private int x;
    private String name;
    // no-argu constructor----
    A()
    {
        this(1,"shilwant");
        System.out.println("no-Argument constructor");
        // x =1;
        // name = "alpha"; 

    }
    // argu-constructor-------------
    A(int x , String name )
    {
        this.x = x;
        this.name = name;
        System.out.println("Argument constructor");
    }
    void show()
    {
        System.out.println(x+ " "+name);
    }

}
class thisconst{

    public static void main(String[] args) {
        
        A a = new A();
        a.show();
        // A a2 = new A(101 , "Rahul");
        // a2.show();
        // A a3 = new A(102 , "shilwant");
        // a3.show();
        
    
    }

    
}