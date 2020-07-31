public class Area {


    public static void main(String[] args) {
        System.out.println(args[0]);
    }


    // MethodOverloading


    // Rectangle
    public static int calculateArea(int length, int breadth) {


        return length * breadth;
    }

    // Circle PI * r^2
    public static double calculateArea(int radius) {


        return Math.PI * radius * radius;
    }

    //square
    public static int calculateArea(String length) {
        return Integer.parseInt(length) * Integer.parseInt(length);
    }
}


     // "1234a"eg: PARSE INT Usage: converts length(string) parsed into INT value look for any kind of numbers in a String
     // Value of usage : same as parse int; until there are some un-assigned numbers;

