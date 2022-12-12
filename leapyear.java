package Assignment;

import java.util.Scanner;

//I/P -> Year, ensure it is a 4 digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.

public class leapyear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year != 0) {
            if (year % 400 == 0)
                System.out.println(year + " year is a leap year");
            else if (year % 100 == 0)
                System.out.println(year + "is not leap year");

            else if (year % 4 == 0)
                System.out.println(year + "is leap year");

            else
                System.out.println(year + " is not leap year");

        }

    }
}

