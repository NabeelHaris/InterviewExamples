import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CheckAdditionOfNumberInArray {

    private Scanner input  = new Scanner(System.in);

    private int[] array = { 2, 7, 4, 5, 11, 5, 20};
    private int number;
    private boolean result;

    public boolean checkSumOfNumberInArray() {

        System.out.print("Enter number: ");
        number = input.nextInt();

        System.out.println("Pairs of elements and their sum : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                   result = true;

                }
//                else {
//                    result = false;
//                    break;
//                }
            }
        }
        return result;
    }
}

