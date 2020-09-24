class P
{

    static void show()
    {
        System.out.println("super class");
    }

}
class S extends P
{


    static void show()
    {
    
        System.out.println("derived class of P");
    }


}

class practice
{

    public static void main(String[] args) {
 
        P p  =  new S();
        
        if(p instanceof S)
        {
        S s = (S) p;
        }
            
        p.show();
      
        
    }

}