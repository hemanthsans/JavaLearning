import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int switchCase = scan.nextInt();

        // Switch()


        switch(switchCase){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input!");
                break;

        }




    }




}
