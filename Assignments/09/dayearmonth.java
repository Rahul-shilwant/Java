import java.util.Scanner;
class dayearmonth
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter days");
        int d = sc.nextInt();
        int m = d/30;
        int y = d/365;
        int w = m%7;
        System.out.println("Total days: "+d+"\n"+" months :"+m+"\n" +" Year :"+y+"\n"+"Week :"+w);

    }

}