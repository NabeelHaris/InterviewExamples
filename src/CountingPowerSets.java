import java.util.Arrays;
import java.util.Scanner;

public class CountingPowerSets {

    private int[] result;
    private int size;


    Scanner input = new Scanner(System.in);

    public int countPowerSet(){

        System.out.print("Enter array length: ");
        size = input.nextInt();

         int[] list = new int[size];
        System.out.println("Enter List/Array: ");
        for (int i=0; i< list.length; i++){
            list[i] = input.nextInt();
        }
        System.out.println( Arrays.toString(list));
        int count = 0;
        for(int i =0; i< list.length; i++){
            count++;
        }
        return (int) Math.round(Math.pow(2,count));


    }

}
