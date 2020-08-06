import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElementInArray {


  private   Scanner input = new Scanner(System.in);

    public int returnMissingElementFromArray(){

        int[] numbers = {1,2,3,4,5,6,7,8,10};

//        int missingNumber = 0;
//        int total;
//        System.out.println("Array is :" + Arrays.toString(numbers));
//        System.out.print("Enter Missing number: ");
//        missingNumber = input.nextInt();
//
//        total = (missingNumber + 1) * (missingNumber + 2) / 2;
//
//        for (int i = 0; i<missingNumber; i++){
//            total -=numbers[i];
//        }
//
//        return total;


        int m  = numbers.length + 1;
        int total = m * (m + 1) / 2;
        int sum = Arrays.stream(numbers).sum();

        return total - sum;

    }

}
