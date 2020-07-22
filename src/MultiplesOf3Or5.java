import java.util.Scanner;

public class MultiplesOf3Or5 {


    Scanner input = new Scanner(System.in);

    public int returnMultipleOf3Or5(){
        int sum = 0;
        int number;

        System.out.print("Enter number for check: ");
        number = input.nextInt();

        for (int i =0; i<number; i++){

            if (i % 3 ==0 || i % 5 ==0){
                sum += i;
            }
        }

        return sum;

    }
}
