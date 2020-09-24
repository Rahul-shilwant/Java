class P
{

    void show()
    {
        System.out.println("super class");
    }

}
class S extends P
{


    protected void show()
    {
        // super.show();
        System.out.println("derived class of P");
    }


}

class prac1
{

    public static void main(String[] args) {
 
        P p  =  new S();
      
        p.show();
    }

}