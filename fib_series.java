package Assignment;

public class fib_series {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c;
        System.out.println(a);
        for (int i = 0; i <= 20; i++) // using for loop
        {

            c = a + b;
            System.out.println(c);

            a = b;//swap two variables
            b = c;


        }
        //using while loop

        int a1 = 0, b1 = 1;
        int c1 = 0;
        while (c1 <= 10) {
            c1 = a1+b1;
            System.out.println(c1);

            a1 = b1;//swap 
            b1 = c1;

        }
    }
}
