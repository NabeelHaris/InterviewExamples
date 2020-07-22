import java.util.Scanner;

public class InvisibleCubes {


    private int cubesNumber;
    public int invisibleCubes(){


        Scanner input =new Scanner(System.in);

        System.out.println("Enter Cubes:");
        cubesNumber = input.nextInt();

        cubesNumber = cubesNumber - 2;
        return cubesNumber * cubesNumber * cubesNumber;
    }
}
