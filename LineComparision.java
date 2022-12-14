package assignment8;

import java.util.Scanner;

public class LineComparision {
    static double getLength(double x1, double y1, double x2, double y2){
        return (Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
    }

    public static void main(String[] args) {
        double lengthOfLine1, lengthOfLine2;
        System.out.println("welcome to line comparision");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter value for x1,y1 and x2,y2 of line1");
        lengthOfLine1 = getLength(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("length of line 1 = " + lengthOfLine1);
        System.out.println(" enter value for x1,y1 and x2,y2 of line1");
        lengthOfLine2 = getLength(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        Integer l1 = (int) lengthOfLine1;
        Integer l2 = (int) lengthOfLine2;
        if (l1.equals(l2)){
            System.out.println("two line are equals");
        }
        else {
            System.out.println("lines are not equals");
        }
    }
}
