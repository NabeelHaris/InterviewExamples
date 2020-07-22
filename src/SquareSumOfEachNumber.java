import java.util.Scanner;

public class SquareSumOfEachNumber {

    Scanner input  = new Scanner(System.in);


    public int returnSquareOfEachNumber(){

        int result =0;
        int[] array = {1, 2, 2};

        for (int i =0; i<array.length; i++){
            result = array[i] * array[i] + result;
        }

        return result;
    }

}
