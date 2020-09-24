class P
{

     void show()
    {
        System.out.println("super class");
    }

}
class S extends P
{


    void display()
    {

        System.out.println("another derived class ,method");
    }
     void show()
    {
        
        System.out.println("derived class");
    }


}

class prac
{

    public static void main(String[] args) {
 
        P p = new S();
        p.show();


        

    }

}