package Assignment;

import java.util.Optional;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int divide, divisor;
        int quotient,remainder;
        System.out.println("enter Quotients number");
        divide = sc.nextInt();
        System.out.println("enter Remainder number ");
        divisor = sc.nextInt();
         quotient = divide / divisor;
         remainder = divide % divisor;
         System.out.println(" quotient : " + quotient);
        System.out.println(" remainder : " + remainder);
    }
}
