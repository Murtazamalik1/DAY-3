package Assignment;

import java.util.*;

//Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.


public class harmonic_number {
    public static void main(String[] args) {

        double result = 0, num = 0, j;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the harmonic you want to find: ");
        n = sc.nextInt();

        // COMPUTATION
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);

    }

}