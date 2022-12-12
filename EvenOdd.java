package Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter any number to check number is even or add ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is even :" + n);
        }
        else {
            System.out.println(" number is odd :" + n);
        }
    }
}
