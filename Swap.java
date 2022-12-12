package Assignment;

public class Swap {
    public static void main(String[] args) {
        int a =30, b = 10;
        System.out.println("before swap : " + a + " " +b);
        int temp = a;
        a = b;
        b  = temp;

        System.out.println(" after swap : " + a + " " +b);

    }
}
