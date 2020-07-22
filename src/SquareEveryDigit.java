import java.util.Scanner;

public class SquareEveryDigit {


    Scanner input = new Scanner(System.in);

    public int returnSquareOFEveryInteger(){

    int numberSize;
    String result = "";
//    System.out.print("Enter array size: ");
//    numberSize = input.nextInt();

   int[] squareRootCheck = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

   System.out.print("Enter number: ");
    for (int i = 1; i< squareRootCheck.length; i++){
        result = squareRootCheck[i]* squareRootCheck[i] + result;

    }
    return Integer.parseInt(result);
    }
}
