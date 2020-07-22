import java.util.Scanner;


public class ConvertNumberToReversedArray {

    Scanner input  =new Scanner(System.in);

    public String returnReversedArray(){

        int number;

        System.out.print("Enter Number to reversed: ");
        number = input.nextInt();

        return new StringBuilder().append(number).reverse().chars().map(Character::getNumericValue).toArray().toString();
    }

}
