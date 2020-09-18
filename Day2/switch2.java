import java.util.Scanner;

class switch2
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dayno : ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'a':
                System.out.println(ch+" is VOwel");
                break;

                case 'e':
                                System.out.println(ch+" is VOwel");
                                break;

                case 'i':
                                System.out.println(ch+" is VOwel");
                                break;

                case 'o':
                                System.out.println(ch+" is VOwel");
                                break;

                case 'u':
                                System.out.println(ch+" is VOwel");
                                break;

            default:
                System.out.println("Not Vowel");
        }

    }



}