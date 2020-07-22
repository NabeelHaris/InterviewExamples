import java.util.Scanner;

public class CheckPivotElementInArray {


    private Scanner input = new Scanner(System.in);


    public int returnPivotElementInArray(){

        int[] array = new int[6];
        int pivot = 0;
        int left =0;
        int right =0;

        System.out.println("Enter number to check: ");
        for (int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }

        for (int i= 1; i<array.length; i++){
        array[i] += array[i - 1];
        }
        int last = array.length - 1;

        if (array[last] - array[0] == 0){
            return 0;
        }
        for (int i =1; i<array.length;i++){
            if (array[last] - array[i] == array[i-1]){
                pivot = i;
            }
        }

        return pivot;
    }

}
