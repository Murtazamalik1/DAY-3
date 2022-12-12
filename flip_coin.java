package Assignment;
import java.util.Scanner;
//Flip Coin and print percentage of Heads and Tails

public class flip_coin {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // INITIALIZATION
            int n;
            int head_cnt = 0;
            int tail_cnt = 0;
            double heads, tails;


            // INPUT DATA
            System.out.print("enter no of times to Flip Coin: ");
            n = input.nextInt();

            // COMPUTATION
            for (int j = 0; j < n; j++) {
                double random = Math.random();
                if (random < 0.5)
                    tail_cnt++;
                else
                    head_cnt++;
            }

            heads = head_cnt/ (double) n * 100;
            tails = tail_cnt / (double) n * 100;
            System.out.println("Percentage of heads: " + heads + "%");
            System.out.println("Percentage of tails: " + tails + "%");

        }

    }

