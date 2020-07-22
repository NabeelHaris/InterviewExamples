import java.util.Scanner;

public class FactorialOfNumber {

    Scanner input = new Scanner(System.in);


    public int returnFactorialOfNumber(){

        int number;
        int fact = 1;


        System.out.print("Enter number to find Factorial: ");
        number = input.nextInt();

        for (int i = 1; i<=number; i++){
           fact = fact * i;
        }
        return fact;
    }


}
