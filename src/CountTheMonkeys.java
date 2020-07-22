import java.util.Arrays;
import java.util.Scanner;

public class CountTheMonkeys {


    Scanner input =new Scanner(System.in);

    public String countMonkey(){
        int number;
        String value;

        System.out.print("Enter number:");
        number = input.nextInt();

        int[] result =new int[number];
        for (int i =0; i<number; i++){
            result[i] = i+1;
        }
        return Arrays.toString(result);
    }
}
