import java.util.Scanner;

public class IsNumberDivisibleByXAndY {

    Scanner input =new Scanner(System.in);

    public boolean returnTrueIfNumberIsDivisibleByXY(){
        int number;
        int valueX;
        int valueY;
        boolean check;
        System.out.print("Enter Number: ");
        number = input.nextInt();

        System.out.print("Enter valueX: ");
        valueX = input.nextInt();

        System.out.print("Enter valueY: ");
        valueY = input.nextInt();

        if (number % valueX == 0 && number % valueY == 0){
            check = true;
        }
        else{
            check =false;
        }

        return check;
    }
}
