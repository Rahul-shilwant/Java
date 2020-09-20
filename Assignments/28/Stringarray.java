import java.util.*;
class Stringarray
{


    public static void main(String[] args) {

        String name[] = new String[]{"Rahul","Rahul1","Rahul2","Rahul3","Rahul4"}; 

        // for(int i = 0 ; i<name.length ; i++)
        // {
        //     System.out.println(""+name[i]);            
        // }

            for(String str : name)
            {
                System.out.println(" "+str);
            }

    }
}