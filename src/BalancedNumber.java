import java.util.Scanner;

public class BalancedNumber {


    Scanner input =new Scanner(System.in);

    public String returnStringIfNumberIsBalanced(){

        long number = 0;

        System.out.print("Enter number to check: ");
        number = input.nextInt();

        if (number < 100) return "Balanced";
        String s = String.valueOf(number);
        int sum1 = 0, sum2 = 0;
        int n = s.length();
        for (int i = 0; i < (n - 1) / 2; i++) {
            sum1 += (s.charAt(i) - '0');
            sum2 += (s.charAt(n - i - 1) - '0');
        }
        if (sum1 == sum2) {
            return "Balanced";
        }
        else {
            return "Not Balanced";
        }
    }

}
