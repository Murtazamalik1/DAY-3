package Assignment;
import java.util.Scanner;

import java.util.Scanner;
//Desc -> A program with cubic running time. Read in N integers and counts the
//number of triples that sum to exactly 0.
//b. I/P -> N number of integer, and N integer input array
//c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0

public class two_d_array {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the integers :");

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        int distinctCount = 0;

        for (int i = 0; i < number - 2; i++)
            for (int j = i + 1; j < number - 1; j++)
                for (int k = j + 1; k < number; k++)

                    if ((arr[i] + arr[j] + arr[k]) == 0) {

                        distinctCount++;
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");

                    }

        System.out.println("Total distinct triples : " + distinctCount);

        //Write a program Distance.java that takes two integer command-line arguments x
        //and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
        //formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

        //Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
        //Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
        //can be found using a formula (Note: Take a, b and c as input values)
        //delta = b*b - 4*a*c
        //Root 1 of x = (-b + sqrt(delta))/(2*a)
        //Root 2 of x = (-b - sqrt(delta))/(2*a)

        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;


        double determinant = b * b - 4 * a * c;


        if (determinant > 0) {


            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }


        else if (determinant == 0) {


            //  -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

        //Write a program WindChill.java that takes two double command-line arguments t
        //and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
        //temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
        //National Weather Service defines the effective temperature (the wind chill) to be:

        double t = Double.parseDouble(args[0]); // temperature (F)
        double v = Double.parseDouble(args[1]); // velocity of wind (mph)

        // careful to add all three * signs:
        double windChillTemp = 35.74 + 0.6215 * t +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        // print the result
        System.out.println(windChillTemp); // windchill (F)


        //Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
        //standard input and printing them out to standard output.
        //b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
        //c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
        int p, q, m, n;    //Declare matrix size


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:");
        p = sc.nextInt();

        System.out.print("Enter the number of columns in the first matrix:");
        q = sc.nextInt();

        System.out.print("Enter the number of rows in the second matrix:");
        m = sc.nextInt();

        System.out.print("Enter the number of columns in the second matrix:");
        n = sc.nextInt();

        if (p == m && q == n)
        {
            int a1[][] = new int[p][q];    //Declare first matrix
            int b1[][] = new int[m][n];    //Declare second matrix
            int c1[][] = new int[m][n];    //Declare third matrix
            //Initialize the first matrix
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < q; j++)
                {
                    a1[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //Initialize the second matrix
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    b1[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //Print the first matrix
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < q; j++)
                {
                    System.out.print(a1[i][j]+" ");
                }
                System.out.println("");
            }
            //Print the second matrix
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(b1[i][j]+" ");
                }
                System.out.println("");
            }
            //Loop to add matrix elements
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < q; k++)
                    {
                        c1[i][j] = a1[i][j] + b1[i][j];
                    }
                }
            }
            //Print the resultant matrix
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(c1[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition not possible");
            System.out.println("Try Again");
        }

    }
}
