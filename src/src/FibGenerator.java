/**
 * Created by Rupponi on 3/7/2017.
 */
import java.util.Scanner;

public class FibGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,x;

        System.out.println("Hello. This will generate a selected number from the Fibonacci sequence. Please enter a number.");
        n = scan.nextInt();

        int[] fibSequence = new int[n];

        for (x = 0; x < 2; x++) {
            fibSequence[x] = x;
        }
        if (n >= 2) {
            for (x = 2; x < n; x++) {
                fibSequence[x] = fibSequence[x - 1] + fibSequence[x - 2];
            }
        }
        int result = fibSequence[n-1];

        int lastDigit = getLast(result);
        String suffix = " ";

        switch(lastDigit) {
            case 1: suffix = "st"; break;
            case 2: suffix = "nd"; break;
            case 3: suffix = "rd"; break;
            case 4:case 5:case 6:case 7:case 8:case 9:case 0: suffix = "th"; break;
        }

        System.out.format("The %d%s number of the Fibonacci sequence is %d.",n,suffix,result);
    }

    public static int getLast(int numberIn) {
        String temp = Integer.toString(numberIn);
        int[] stringNum = new int[temp.length()];
        int lastDigit = stringNum[temp.length()-1];

        return lastDigit;
    }
}
