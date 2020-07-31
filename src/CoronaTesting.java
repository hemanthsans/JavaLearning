
import java.util.Scanner;

public class CoronaTesting {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Person's Age: ");
        int personAge = scan.nextInt();

        System.out.println("Enter Symptoms:(separated by commas) ");
        String symptoms = scan.next();


        if(checkForSymptoms(symptoms)){
            System.out.println("Showing Symptoms of COVID-19 ");
        }
        else
            {
            System.out.println("Is patient showing all Symptoms of COVID-19");
        }
        if (checkAgeGroupForAttention(personAge) && checkForSymptoms(symptoms)) {
            System.out.println(checkForSymptoms(symptoms));
            System.out.println("Immediate Action: (Required)");
        }else{
            System.out.println(checkForSymptoms(symptoms));
            System.out.println("Immediate Action: (Not Required)");

        }

    }

    public static boolean checkAgeGroupForAttention(int perAge) {
        if (perAge <= 10 || perAge >= 50) {
            return true;
        } else if (perAge > 10 || perAge < 50) {

            return false;
        }
        return false;
    }

    public static boolean checkForSymptoms(String symptoms) {
        if(symptoms.contains("cold") && symptoms.contains("bodyAches")) {

            return true;
        }

        return false;
    }



}










