package Assignment;

import java.util.Scanner;

//Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.

public class prime_factors {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int div=2;div * div<=n;div++){
            if (n%div==0){
                n = n/div;
                System.out.println(div+ "");
            }
        }
        if (n!=0){
        System.out.println(n+"");
    }

}
}


