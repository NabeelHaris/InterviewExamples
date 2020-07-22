import java.util.Arrays;
import java.util.Scanner;

public class FindTheFirstNonConsecutiveNumber {


    Scanner input = new Scanner(System.in);

    public void returnNonConsecutiveNumber(){

        int[] array = new int[7];
        boolean result = true;

        System.out.print("Enter array: ");
        for (int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }

        for (int i=0; i<array.length;i++) {
            Arrays.sort(array);
            if ((array[i + 1] - array[i]) == 1) {
            } else {
                result = false;
                break;
            }
        }
        if(result)
            System.out.println("True");
        else
            System.out.println("False");

        }
}

