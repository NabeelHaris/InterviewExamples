import java.util.Scanner;

public class SumOFSeriesStartFormZero {


    Scanner input = new Scanner(System.in);

    public String returnSumOfSeries(){

        int value;

        System.out.print("Enter Value: ");
        value = input.nextInt();

        if (value < 0)
            return value + "<0";

        if (value == 0)
            return "0=0";

        int sum = 0;
        String result = "0";

        for (int i = 1; i <= value; i++) {
            result += "+" + i;
            sum += i;
        }

        return result += " = " + sum;
    }
}

