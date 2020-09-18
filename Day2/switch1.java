import java.util.Scanner;

class switch1
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dayno : ");
        byte day = sc.nextByte();

        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("nooob");
        }

    }



}