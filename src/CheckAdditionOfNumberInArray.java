import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CheckAdditionOfNumberInArray {

    Scanner input  = new Scanner(System.in);

    int[] array = { 2, 7, 4, 5, 11, 5, 20};
    int number;
    boolean result = false;

    public boolean returnAdditionOfNumber(){

         int sum = 0;

         System.out.print("Enter Number: ");
         number = input.nextInt();

         for (int i=0; i<array.length; i++){
             sum +=array[i];
             if (sum == number){
                 result = true;
             }
             else {
                 result = false;
             }
         }
        return result;
    }

    public boolean checkSumOfNumberInArray() {

        System.out.print("Enter number: ");
        number = input.nextInt();

        System.out.println("Pairs of elements and their sum : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    result = true;
                    break;
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

