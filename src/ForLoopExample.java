import java.math.*;
public class ForLoopExample {
    static int firstDigit(int n)
    {
        int digits = (int)(Math.log10(n));

        n = (int)(n / (int)(Math.pow(10, digits)));

        // Return first digit
        return n;
    }

    static int lastDigit(int n)
    {
        return (n % 10);
    }
    public static void main(String[] args) {

        // for (intialization; updation/termination ; increment)
        // I iterate or loop over things from the "Intializer" till I reach termination; Until then I keep incrementing
        // with the use of intializer

        //post increment; pre-increment

//        String s = "Ravi,Santosh,Teja,Swathi,Sarath";
//        String[] names = s.split( "," );
//
//        for(int i =0;i<names.length; i++){
//            System.out.println(names[i]);
//
//        }

        // to print the sum of the first digit and the last digit
       // int largeSum = 122345;
        //1+5=6;
        // Find the first digit

        int n = 987656;
        System.out.println(firstDigit(n) +
                " " + lastDigit(n));





    }
}
