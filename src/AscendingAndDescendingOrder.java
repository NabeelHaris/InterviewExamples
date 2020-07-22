import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescendingOrder {


    Scanner input  = new Scanner(System.in);

    private int value;

    public void returnArrayIntoAscendingOrder(){

        int[] array1 = new int[5];
        int value;

        System.out.print("Enter Array values: ");
        for (int i=0; i<array1.length; i++) {
            array1[i] = input.nextInt();
        }
        for (int q =0; q<array1.length; q++){
            for (int k=q+1; k<array1.length; k++){
                if (array1[q] > array1[k]){
                    value = array1[q];
                    array1[q] = array1[k];
                    array1[k] = value;
                }
            }
        }
        System.out.println("Ascending order is: ");
        for (int i = 0; i<array1.length; i++ ) {
            System.out.println(array1[i] + ",");
        }
//        Arrays.sort(array);
//
//        System.out.println("Ascending order is" +
//                            Arrays.toString(array));
    }


    public void returnDescendingOrder(){

        int[] array = new int[5];

        System.out.print("Enter Array values: ");
        for (int i=0; i<array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int j =0; j<array.length; j++){
            for (int k=j+1; k<array.length; k++){
                if (array[j] < array[k]){
                    value = array[k];
                    array[k] = array[j];
                    array[j] = value;
                }
            }
        }
        System.out.println("Descending order is: ");
        for (int q = 0; q<array.length; q++ ) {
            System.out.print(array[q] + ",");
        }
    }

}
